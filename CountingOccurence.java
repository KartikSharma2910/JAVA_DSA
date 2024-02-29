import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int target = input.nextInt();
        int count = 0;

        while (n != 0) {
            int last_digit = n % 10;
            if (last_digit == target) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);

        input.close();
    }
}
