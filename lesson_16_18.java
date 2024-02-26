public class lesson_16_18 {
    //Класс BufferedReader

    //Есть еще один интересный класс, который вы, скорее всего, будете часто использовать — BufferedReader.
    //Это тоже «промежуточный поток», который читает данные из другого потока.
    //Класс BufferedReader, как видно из его названия, является классом-наследником от Reader и позволяет читать символы.
    //Однако, что самое интересное, в качестве источника данных в него тоже нужно передать поток,
    //из которого можно читать символы – поток-наследник от класса Reader.
    //В чем же смысл? В отличие от InputStreamReader’а, класс BufferedReader не преобразовывает байты в символы:
    //он вообще ничего не преобразовывает. Вместо этого он буферизует данные.

    //Когда программа читает из объекта BufferedReader один символ, он читает из своего потока-источника сразу большой массив символов.
    //И сохраняет их у себя внутри.
    //При чтении следующего символа из объекта BufferedReader,
    //он просто возьмет очередной символ из своего внутреннего массива-буфера и отдаст его, не обращаясь при этом к потоку-источнику данных.
    //И только когда все символы в буфере закончатся, он снова прочитает большой массив символов.
    //Еще у класса BufferedReader есть очень полезный метод — String readLine(),
    //который позволяет читать данные из потока-источника сразу строками.
    //С помощью этого метода можно, например, прочитать какой-то файл и вывести его содержимое на экран построчно. Пример:
    //Мы специально записали код в компактном формате, чтобы вы увидели, как это может быть удобно.
    //Можно записать данный код и немного более детально.

    /*
    String src = "c:\\projects\\log.txt";

    try(FileReader in = new FileReader(src);            //Создаем объект FileReader, источник данных — файл.
    BufferedReader reader = new BufferedReader(in))     //Создаем объект BufferedReader, источник данных — объект FileReader;
    {
        while (reader.ready())                          //пока в reader еще есть данные
        {
            String line = reader.readLine();            //Прочитать одну линию
            System.out.println(line);                   //Вывести линию на экран
        }
    }
    */

    //Если вы соединили несколько потоков в цепочку, метод close() достаточно вызвать только у одного из них:
    //он вызовет его у своего источника данных и т.д., пока не дойдут до финального потока с данными.
}