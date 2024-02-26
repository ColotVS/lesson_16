import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class lesson_16_13 {
    //Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2.
    //Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу:
    //первый со вторым, третий с четвертым, и т.д.
    //Если последний байт в файле1 нечетный, то пишем его в файл2 как есть.
    //Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            outputStream.write(bytesOut);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
