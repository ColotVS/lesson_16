public class lesson_16_46 {
    //Метод Files.newInputStream

    //Начиная с Java 5 классы FileInputStream и FileOutputStream стали считаться устаревшими.
    //Одним из их минусов было то, что при создании объекта этих классов сразу происходит создание файлов на диске.
    //И потенциально выбрасываются все ошибки, связанные с созданием файлов.
    //Впоследствии это было признано не самым хорошим решением.
    //Поэтому для создания объектов-файлов рекомендуется использовать методы утилитного класса – java.nio.Files.

    //Вот сравнение старого подхода к созданию файлов и нового:
    //Было
    //String src = "c:\\projects\\log.txt";
    //InputStream input = new FileInputStream( src );

    //Стало
    //String src = "c:\\projects\\log.txt";
    //InputStream input = Files.newInputStream( Path.of( src ) );

    //Аналогично замена и для FileOutputStream:
    //Было
    //String src = "c:\\projects\\log.txt";
    //OutputStream  output = new FileOutputStream( src );

    //Стало
    //String src = "c:\\projects\\log.txt";
    //OutputStream  output = Files.newOutputStream( Path.of( src ) );
}
