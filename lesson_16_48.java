import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class lesson_16_48 {
    //Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять во временный файл.
    //Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStream input = new URL(scanner.nextLine()).openStream();
        Path file = Files.createTempFile(null,null);
        Files.write(file, input.readAllBytes());
    }
}
