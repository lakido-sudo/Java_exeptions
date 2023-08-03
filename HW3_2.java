import java.util.Arrays;

public class HW3_2 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);

            printSum(-2,2);

            int[] abc = {1, 2};
            abc[4] = 9;
            System.out.println(Arrays.toString(abc));

        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

        private static void printSum(int i, int i1) {
            System.out.println(i + i1);
        }
}