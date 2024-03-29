import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class lesson_16_41 {
    //Нужно написать программу, которая будет считывать с клавиатуры два пути к файлу.
    //Если файла по первому пути не существует, его нужно создать.
    //Если же файл по первому пути существует, нужно переместить этот файл по второму пути, но только в том случае,
    //если по второму пути файла нет.
    //Если же он есть, нужно просто удалить файл по первому пути.
    //Используй соответствующие методы класса Files: createFile(), move(), delete(), exists()/notExists().
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (!Files.exists(filePath))
        {
            Files.createFile(filePath);
        }
        else if (!Files.exists(fileNewPath))
        {
            Files.move(filePath,fileNewPath);
        }
        else Files.delete(filePath);
    }
}
