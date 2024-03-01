public class lesson_16_49 {
    //Класс URLConnection

    //Кроме простого чтения данных из интернета, мы еще можем и загружать туда данные.
    //Загрузка данных — это куда более сложный процесс, чем считывание. Вам понадобится на несколько методов больше. Пример:

    /*
    URL url = new URL("https://javarush.com");              Создаем объект URL с путем к странице
    URLConnection connection = url.openConnection();        Создаем двустороннее соединение

    // получили поток для отправки данных
    OutputStream output = connection.getOutputStream();     Получаем поток вывода
    output.write(1); // отправляем данные                   Выводим в него данные

    // получили поток для чтения данных
    InputStream input = connection.getInputStream();        Получаем поток ввода
    int data = input.read(); // читаем данные               Читаем из него данные
    */

    //Обратите внимание, что тут мы больше не вызываем метод url.openStream(). Вместо этого мы идем по более длинному пути:

    //Сначала мы устанавливаем стабильное двустороннее соединение с помощью метода URLConnection openConnection()

    //Затем получаем поток для отправки данных с помощью метода connection.getOutputStream() и отправляем данные серверу

    //Затем получаем поток для чтения данных с помощью метода connection.getInputStream() и начинаем читать из него данные.

    //Контроль ресурсов
    //Строго говоря, мы должны все потоки обернуть в try-with-resources для безопасной работы.
    //А еще не помешало бы обернуть голые InputStream и OutputStream во что-нибудь более удобное.
    //Например, в PrintStream и BufferedReader.

    //Если мы все это сделаем, наш код будет выглядеть как-то так:
    /*
    URL url = new URL("https://javarush.com");
    URLConnection connection = url.openConnection();

    // отправляем данные
    try (OutputStream output = connection.getOutputStream();
    PrintStream sender = new PrintStream(output))
    {
        sender.println("Привет");
    }

    // читаем данные
    try(InputStream input = connection.getInputStream();
    BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
    {
        while (reader.ready())
            System.out.println(reader.readLine());
    }
    */
}
