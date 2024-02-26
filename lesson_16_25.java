public class lesson_16_25 {
    //Класс StringWriter

    //Есть еще один интересный класс-наследник от класса Writer — это StringWriter.
    //В нем находится изменяемая строка — объект StringBuffer.
    //И каждый раз, когда вы что-то «пишете» в объект StringWriter, текст просто добавляется во внутренний буфер.

    //Пример:
    /*
    StringWriter writer = new StringWriter();   //Создается целевой символьный поток StringWriter
    writer.write("Hello");                      //Строка пишется в буфер внутри StringWriter
    writer.write(String.valueOf(123));          //Строка пишется в буфер внутри StringWriter
    String result = writer.toString();          //Преобразовываем содержимое объекта к строке
    */

    //В данном случае класс StringWriter — это, по сути, обертка над классом StringBuffer,
    //однако класс StringWriter — это наследник класса-потока Writer,
    //и он может использоваться в цепочках из объектов-потоков. Довольно полезное свойство на практике.
}
