import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class lesson_16_26 {
    //Необходимо записать байты в файл.
    //Написали программу, которая считывает из консоли путь к файлу и записывает в этот файл последовательность байтов,
    //полученную из аргумента метода main(String[]). Но в процессе написания программы допустили ошибку.
    //Как ты уже знаешь, BufferedWriter "не работает" с байтами:
    //для записи байтов в файл нужно использовать метод write(Path, byte[]) класса Files.
    //Path можно получить используя статический метод Path.of(), в который передать путь к файлу, считанный из консоли.
    //Выглядит это так - Path.of(scanner.nextLine()).

    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        Scanner scanner = new Scanner(System.in);
        Files.write(Path.of(scanner.nextLine()), bytes);
    }
}
