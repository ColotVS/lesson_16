import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class lesson_16_02 {
    //Метод close()

    //У классов, которые используют внешние ресурсы, есть специальный метод для их освобождения — close().
    //Ниже приведем пример программы, которая что-то пишет в файл и закрывает его за собой – освобождает ресурсы операционной системы.
    //Выглядит это примерно так:

    public static void main(String[] args) throws IOException {
        String path = "c:\\projects\\log.txt";                  //Путь к файлу.
        FileOutputStream output = new FileOutputStream(path);   //Получаем объект файла: захватываем ресурс.
        output.write(1);                                     //Пишем в файл
        output.close();                                         //Закрываем файл — освобождаем ресурс
    }
    //После работы с файлом (или другим внешним ресурсом) вы должны вызвать у объекта, связанного с внешним ресурсом, метод close().
}
