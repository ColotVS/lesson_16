public class lesson_16_35 {
    //Класс Files

    //Чтобы работать с файлами, есть шикарный утилитный класс — java.nio.file.Files. У него есть методы просто на все случаи жизни.
    //Все методы этого класса статические и работают с объектами типа Path. Методов очень много, поэтому мы рассмотрим только основные:

    //Метод	                                                        Описание
    //Path createFile(Path path)                                    Создает новый файл с путем path
    //Path createDirectory(Path path)                               Создает новую директорию
    //Path createDirectories(Path path)                             Создает несколько директорий
    //Path createTempFile(prefix, suffix)                           Создает временный файл
    //Path createTempDirectory(prefix)                              Создает временную директорию
    //void delete(Path path)                                        Удаляет файл или директорию, если она пуста
    //Path copy(Path src, Path dest)                                Копирует файл
    //Path move(Path src, Path dest)                                Перемещает файл
    //boolean isDirectory(Path path)                                Проверяет, что путь — это директория, а не файл
    //boolean isRegularFile(Path path)                              Проверяет, что путь — это файл, а не директория
    //boolean exists(Path path)                                     Проверяет, что объект по заданному пути существует
    //long size(Path path)                                          Возвращает размер файла
    //byte[] readAllBytes(Path path)                                Возвращает все содержимое файла в виде массива байт
    //String readString(Path path)                                  Возвращает все содержимое файла в виде строки
    //List<String> readAllLines(Path path)                          Возвращает все содержимое файла в виде списка строк
    //Path write(Path path, byte[])                                 Записывает в файл массив байт
    //Path writeString(Path path, String str)                       Записывает в файл строку
    //DirectoryStream<Path> newDirectoryStream(Path dir)            Возвращает коллекцию файлов (и поддиректорий) из заданной директории

}
