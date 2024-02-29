import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("Very high protein fruit");
            default -> System.out.println("Not a fruit baccha");
        }

        input.close();
    }
}
