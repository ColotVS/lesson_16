import java.nio.file.Path;
import java.util.Scanner;

public class lesson_16_32 {
    //Разделение пути на части

    //Метод getParent() возвращает путь, который указывает на родительскую директорию для текущего пути.
    //Независимо от того, был этот путь директорией или файлом:
    //Код	                                                Значение
    //String str = "c:\\windows\\projects\\note.txt";
    //Path path = Path.of(str).getParent();                 "c:\\windows\\projects\\"

    //String str = "c:\\windows\\projects\\";
    //Path path = Path.of(str).getParent();                 "c:\\windows\\"

    //String str = "c:\\";
    //Path path = Path.of(str).getParent();                 null


    //Метод getFileName() возвращает одно имя файла (или директории) — то, что идет после последнего разделителя:
    //Код	                                                Значение
    //String str = "c:\\windows\\projects\\note.txt";
    //Path path = Path.of(str).getFileName();               "note.txt"

    //String str = "c:\\windows\\projects\\";
    //Path path = Path.of(str).getFileName();               "projects"

    //String str = "c:\\";
    //Path path = Path.of(str).getFileName();               null


    //Метод getRoot() возвращает путь к корневой директории:
    //Код	                                                Значение
    //String str = "c:\\windows\\projects\\";
    //Path path = Path.of(str).getRoot();                   "c:\\"


    //Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке,
    //после чего в консоли выводится диск (корень для Unix-like), на котором находится этот файл (или папка).
    //Для решения задачи используй Path и его методы.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           //Ввод: c:\test\test.txt
        String str = scanner.nextLine();
        System.out.println(Path.of(str).getRoot());         //Вывод: c:\
    }
}
