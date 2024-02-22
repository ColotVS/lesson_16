import java.io.FileOutputStream;
import java.io.IOException;

public class lesson_16_03 {
    //Исключения

    //Вроде все просто. Однако в процессе работы программы могут возникнуть исключения,
    //и внешний ресурс так и не будет освобожден. А это очень плохо.
    //Чтобы метод close() вызывался всегда, нужно обернуть наш код в блок try-catch-finally и добавить метод close() в блок finally.
    //Выглядеть это будет примерно так:

    public static void main(String[] args) throws IOException {
        String path = "c:\\projects\\log.txt";
        FileOutputStream output = null;

        try
        {
            output = new FileOutputStream(path);
            output.write(1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (output != null)
                output.close();
        }
    }
}
