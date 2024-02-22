import java.util.Scanner;

public class lesson_16_05 {
    //Программа считывает с консоли строку и выводит ее на экран в верхнем регистре.
    //Но оказывается, она не будет работать на старых версиях Java (ниже 7й версии).
    //Не меняя функциональности программы, перепиши блок try-with-resources на обычный try-catch.
    //Не забудь о вызове метода close() для объектов с внешними ресурсами.

    public static void main(String[] args) {
        try
        {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
            scanner.close();
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
