import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class lesson_16_51 {
    //Твоя задача — обратиться к публичному API в интернете и получить данные.
    //Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, получать данные и выводить их на экран.
    //Используй метод openStream() класса URL.
    //Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр:
    //https://javarush.com/api/1.0/rest/projects

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }
}
