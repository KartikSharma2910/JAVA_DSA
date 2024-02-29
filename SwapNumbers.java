/**
 * SwapNumbers
 */
public class SwapNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        swapNumbers(a, b);

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void swapNumbers(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}