import java.util.Arrays;

class HW2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        //Например
        int d = 0;
        int[] intArray = new int[9];
        intArray[8] = 2;

        try {
            int catchedRes1 = intArray[8] / d;
            System.out.println("CatchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            Arrays.asList(e);
            System.err.println("Деление на 0");
        }
    }
}
