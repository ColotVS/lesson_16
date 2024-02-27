import java.nio.file.Path;
import java.util.Scanner;

public class lesson_16_34 {
    //Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли, при этом если путь не абсолютный,
    //то перед выводом его нужно преобразовать к таковому.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of(scanner.nextLine());        //Ввод: \test\test.txt
        if (path.isAbsolute())
        {
            System.out.println(path);
        }
        else {
            System.out.println(path.toAbsolutePath());  //Вывод: C:\test\test.txt
        }
    }
}
