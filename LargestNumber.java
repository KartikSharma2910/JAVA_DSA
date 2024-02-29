import java.util.Scanner;

/**
 * LargestNumber
 */
public class LargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maxNum = 0;

        if (a > b && a > c) {
            maxNum = a;
        } else if (b > a && b > c) {
            maxNum = b;
        } else {
            maxNum = c;
        }

        System.out.println(maxNum);

        input.close();
    }
}