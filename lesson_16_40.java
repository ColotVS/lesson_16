import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class lesson_16_40 {
    //Напиши программу, которая будет считывать с клавиатуры строки, и если данная строка — это путь к существующему файлу,
    //выводить в консоли "<введенная строка> - это файл".
    //Если путь к существующей директории, выводить в консоли "<введенная строка> - это директория".
    //Если строка не является путем к файлу или директории, то выходим из программы.
    //Треугольные скобки и кавычки выводить не нужно.
    //Для проверки файлов и директорий используй методы isRegularFile() и isDirectory() класса Files.
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();                    //Ввод: c:\
            if (str.isEmpty())
                break;
            else {
                Path path = Path.of(str);
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path + THIS_IS_DIR);     //Вывод: c:\ - это директория
                }
                else break;
            }
        }
    }
}
