import java.nio.file.Path;
import java.util.Scanner;

public class lesson_16_33 {
    //Абсолютный и относительный пути

    //Пути бывают двух типов: абсолютные и относительные.
    //Абсолютный путь начинается с корневой директории. Для Windows это может быть папка c:\, для Linux — директория /
    //Относительный путь считается относительно какой-то директории. Т.е. это как бы конец пути, но только без начала.
    //Относительный путь можно превратить в абсолютный и наоборот


    //Метод boolean isAbsolute()
    //Метод проверяет, является ли текущий путь абсолютным
    //Код	                                                Значение
    //String str = "c:\\windows\\projects\\note.txt";
    //boolean abs = Path.of(str).isAbsolute();              true

    //String str = "src\\com\\javarush\\Main.java";
    //boolean abs = Path.of(str).isAbsolute();              false


    //Метод Path toAbsolutePath()
    //Превращает путь в абсолютный, если нужно — добавляет к нему текущую рабочую директорию:
    //Код	                                                Значение
    //String str = "c:\\windows\\projects\\note.txt";
    //Path path = Path.of(str).toAbsolutePath();            "c:\\windows\\projects\\note.txt"

    //String str = "src\\com\\javarush\\Main.java";
    //Path path = Path.of(str).toAbsolutePath();            "d:\\work\\src\\com\\javarush\\Main.java"


    //Метод Path normalize()
    //В пути вместо имени директории можно писать «..», и это будет означать вернуться на одну директорию назад.
    //Нормализация устраняет эти вещи. Примеры:
    //Код	                                                 Значение
    //String str = "c:\\windows\\..\\projects\\note.txt";
    //Path path = Path.of(str).normalize();                  "c:\\projects\\note.txt"

    //String str = "src\\com\\javarush\\..\\Main.java";
    //Path path = Path.of(str).normalize();                  "src\\com\\Main.java"


    //Метод Path relativize(Path other)
    //Метод relativize() позволяет вычислить «разницу путей»: один путь относительно другого
    //Код	                                                    Значение
    //Path path1 = Path.of("c:\\windows\\projects\\note.txt");
    //Path path2 = Path.of("c:\\windows\\");
    //Path result = path2.relativize(path1);                    "projects\\note.txt"

    //Path path1 = Path.of("c:\\windows\\projects\\note.txt");
    //Path path2 = Path.of("c:\\windows\\");
    //Path result = path1.relativize(path2);                    "..\\.."

    //Path path1 = Path.of("c:\\aaa\\bbb\\1.txt");
    //Path path2 = Path.of("d:\\zzz\\y.jpg");
    //Path result = path1.relativize(path2);                    Ошибка IllegalArgumentException: два пути имеют разный "корень" (разные диски)


    //Метод Path resolve(Path other)
    //Метод resolve() выполняет операцию, обратную relativize(): из абсолютного и относительного пути он строит новый абсолютный путь.
    //Код	                                                Значение
    //Path path1 = Path.of("projects\\note.txt");
    //Path path2 = Path.of("c:\\windows\\");
    //Path result = path1.resolve(path2);                   "c:\\windows"

    //Path path1 = Path.of("projects\\note.txt");
    //Path path2 = Path.of("c:\\windows\\");
    //Path result = path2.resolve(path1);                   "c:\\windows\\projects\\note.txt"


    //Метод toFile()
    //Метод возвращает устаревший объект File, который хранит тот же путь к файлу, что и объект Path.


    //Метод toURI()
    //Метод преобразует путь к стандарту URI, возвращает объект, который содержит путь к файлу:
    //Путь к файлу	                        URI к файлу
    //c:\windows\projects\note.txt          file:///c:/windows/projects/note.txt


    //Напиши программу, которая будет считывать с клавиатуры два пути и выводить в консоль относительный путь между первым и вторым путями,
    //если он существует.
    //В противном случае выводить ничего не нужно.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path1 = Path.of(scanner.nextLine());           //Ввод: c:\
        Path path2 = Path.of(scanner.nextLine());           //Ввод: c:\test\test.txt
        try
        {
            System.out.println(path1.relativize(path2));    //Вывод: test\test.txt
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }

    }

}
