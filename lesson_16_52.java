import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class lesson_16_52 {
    //Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
    //Напиши программу, которая будет обращаться по ссылке к публичному API в интернете,
    //отправляя туда данные, получать ответные данные и выводить их на экран.
    //Используй метод openConnection() класса URL.
    //Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
    //Если не знаешь, какой API использовать, бери http://httpbin.org/post.

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        OutputStream output = connection.getOutputStream();
        output.write(1);
        InputStream input = connection.getInputStream();
        byte [] buffer = input.readAllBytes();
        String data = new String (buffer);
        System.out.println(data);
    }
}
