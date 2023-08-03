import java.io.FileNotFoundException;
import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);

            printSum(0, 0);

            int[] abc = { 1, 2 };
            abc[4] = 9;
            System.out.println(Arrays.toString(abc));

        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
        } catch (FileNotFoundException ex) {
            System.err.println("Что-то пошло не так");
        } catch (ArithmeticException ex) {
            System.err.println("Деление на 0!");
        }
    }

    private static void printSum(int i, int i1) throws FileNotFoundException {
            System.out.println(i + i1);
        }
}
