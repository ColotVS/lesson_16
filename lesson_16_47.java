public class lesson_16_47 {
    //Класс URL

    //Работу с потоками ввода-вывода мы уже изучили, работу с файлами изучили, что же изучить дальше?
    //А как насчет работы с сетью и интернетом? Звучит многообещающе, не так ли?
    //В Java работать с интернетом не сложнее, чем работать с файлами. Ну разве что совсем чуть-чуть.
    //Для работы с ресурсами в интернете в Java есть специальный класс — URL.

    //Получение странички из интернета
    //Как вы думаете, сколько строк кода нужно написать,
    //чтобы скачать какой-нибудь текстовый файл из интернета и отобразить его содержимое на экране? 10? 100? 1000? А может быть, 5?

    //Код	                                        Примечание
    //URL url = new URL("https://javarush.com");    Создает объект URL с путем к странице
    //InputStream input = url.openStream();         Получает InputStream у интернет-объекта
    //byte[] buffer = input.readAllBytes();         Читает все байты и возвращает массив байт
    //String str = new String(buffer);              Преобразуем массив в строку
    //System.out.println(str);                      Выводим строку на экран
    //На экране отобразится содержимое HTML-файла

    //Сравнение работы File и URL
    //URL — это такой аналог File или Path, только Path хранит путь к ресурсу в файловой системе, а URL — путь к ресурсу в интернете.
    //Вся магия происходит, когда мы за один вызов метода openStream() получаем сразу объект типа InputStream.
    //Это же стандартный объект, и мы его уже изучили вдоль и поперек. Все становится очевидно уже после получения объекта типа InputStream.
    //Ведь как вычитать из него данные, мы уже знаем.

    //Работа с интернетом                                   Работа с файлом
    //  URL url = new URL("https://javarush.com");          File file = new File("c:\\readme.txt");
    //  InputStream input = url.openStream();               InputStream input = new FileInputStream(file);
    //  byte[] buffer = input.readAllBytes();               byte[] buffer = input.readAllBytes();
    //  String str = new String(buffer);                    String str = new String(buffer);
    //  System.out.println(str);                            System.out.println(str);

    //Сравните: отличаются только две первые строчки, и то немного.
    //Вот оно, преимущество стандартизации и работы с цепочками потоков данных
}
