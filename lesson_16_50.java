public class lesson_16_50 {
    //Примеры работы с сетью

    //А давай-ка мы что-нибудь загрузим из интернета. И не просто загрузим, а сохраним на диск.
    //Например, давайте напишем программу, которая сохраняет на диск картинку с главной страницы Google.
    //В принципе ничего сложного. В самой простой интерпретации этот код будет выглядеть так:
    /*Сохранение файла на диск
    String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
    URL url = new URL(image);
    InputStream input = url.openStream();                   //мы получаем поток данных от интернет-ресурса — от картинки.

    Path path = Path.of("c:\\GoogleLogo.png");              //мы создаем имя файла, в который будем сохранять картинку.
                                                            Имя может быть любым, однако расширение файла должно совпадать с расширением
                                                            картинки в интернете.

    Files.copy(input, path);                                //принимает в качестве первого параметра источник данных —
                                                            байтовый поток (InputStream),
                                                            а в качестве второго параметра — имя файла, куда нужно записывать данные.

    */

    //Теоретически, если бы URL картинки был коротким, этот код вообще можно было бы записать в одну строку:
    //Копирование данных из потока в файл
    //Files.copy(new URL("https://www.google.com/logo.png").openStream(), Path.of("c:\\GoogleLogo.png"));

    //

}
