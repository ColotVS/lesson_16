public class lesson_16_20 {
    //Чтение с консоли

    //И еще один интересный факт: класс Scanner — ничто иное как входящий промежуточный поток данных,
    //который читает их из потока System.in — тоже потока данных.
    //Вот два способа чтения строки с консоли:

    //Класс Scanner
    /*
    InputStream stream = System.in;
    Scanner console = new Scanner(stream);
    String line = console.nextLine();
    */

    //Классы BufferedReader и InputStreamReader
    /*
    InputStream stream = System.in;
    InputStreamReader reader = new InputStreamReader(stream);
    BufferedReader buff = new BufferedReader(reader);
    String line = buff.readLine();
    */

    //Наш знаменитый System.in — это ничто иное как статическая переменная in класса System. Тип ее — InputStream, а имя — in.

}
