import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите что нибудь: ");
        String string = in.nextLine();
        string = string.trim();

        if(string.isEmpty())
            throw new IllegalArgumentException("Строка пустая!");
        else
            System.out.println(string);
    }
}