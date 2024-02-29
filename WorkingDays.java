import java.util.Scanner;

public class WorkingDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Working Day");
            case 6, 7 -> System.out.println("Weekend holiday");
            default -> System.out.println("Not a day");
        }
        input.close();
    }
}
