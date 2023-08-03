import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Введите дробное число (типа float)");
        try {
            float num = scanner.nextFloat();
        }
        catch (InputMismatchException num) {
            System.err.println(
                    "Введено значение не соответствующее " +
                            "типу float (',' вместо '.')");
            run();
        }
    }
}

