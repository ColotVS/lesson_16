import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class lesson_16_06 {
    //Несколько переменных одновременно

    //Кстати, часто может возникнуть ситуация, когда нужно открыть несколько файлов одновременно.
    //Допустим, вы копируете файл, и вам нужны два объекта: файл, из которого вы копируете данные и файл, в который вы копируете данные.
    //На этот случай оператор try-with-resources разрешает создавать в нем не один объект, а несколько.

    //Код создания объектов должен разделяться точкой с запятой. Общий вид такой команды:
    //  try (Класс имя = new Класс(); Класс2 имя2 = new Класс2())
    //  {
    //      Код, который работает с переменной имя и имя2
    //  }

    //Пример копирования файлов:
    public static void main(String[] args) {
        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        try(FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest))
        {
            byte[] buffer = input.readAllBytes();
            output.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
