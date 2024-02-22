import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson_16_04 {
    //try-with-resources

    //Создатели Java и тут решили нам подсыпать немного синтаксического сахарку.
    //Начиная с 7-й версии Java, в ней появился новый оператор try-with-resources (try с ресурсами).
    //Он создан как раз для того, чтобы решать проблему с обязательным вызовом метода close(). В общем случае выглядит он довольно просто:
    //  try (Класс имя = new Класс())
    //  {
    //      Код, который работает с переменной имя
    //  }

    //Это еще одна разновидность оператора try.
    //После ключевого слова try нужно добавить круглые скобки, а внутри них — создать объекты с внешними ресурсами.
    //Для объекта, указанного в круглых скобках, компилятор сам добавит секцию finally и вызов метода close().
    //Ниже написано два эквивалентных примера:
    /*
    Длинный код                                                 	Код с try-with-resources

    FileOutputStream output = null;                                 try(FileOutputStream output = new FileOutputStream(path))
    try                                                             {
    {                                                               output.write(1);
        output = new FileOutputStream(path);                        }
        output.write(1);
    }
    finally
    {
        if (output != null)
        output.close();
    }
    */

    //Код с использованием try-with-resources значительно короче и легче читается.
    //А чем меньше кода, тем меньше шансов сделать опечатку или ошибку.
    //Кстати, у оператора try-with-resources можно дописывать блоки catch и finally.
    //А можно и не добавлять, если в них нет необходимости.

    //Программа считывает с консоли строку и выводит ее на экран в нижнем регистре.
    //Не меняя функциональности программы, перепиши код с использованием try-with-resources.
    //Вынеси в круглые скобки создание объектов с внешними ресурсами. Не забудь удалить ненужные вызовы метода close().

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
