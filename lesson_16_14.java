import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class lesson_16_14 {
    //Есть программа, которая считывает из консоли путь к файлу1 и путь к файлу2 и копирует содержимое файла1 в файл2.
    //Но она не работает корректно. Найди и исправь ошибки в коде, чтобы программа заработала как нужно.

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] buffer = new byte[65536];
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
