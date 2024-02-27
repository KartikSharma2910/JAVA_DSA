import java.util.Scanner;

/**
 * Input_Output =>
 * Everything we will write is inside a class.
 * The wrapper class name and file name should be same.
 * Every variable starting from capital letter is a class.
 * The wrapper class is always public. (Will read more in OOP's)
 * (main) this is the function where our programme will start executing
 * We use static because we want it to run wihout creating the object of the
 * Input_Output class
 * static variables and function does not depend on anything
 * 
 * Primitive Datatypes => These are those datatypes which can not be breaked
 * furthure.
 * eg :- Int , boolena , char , float , double , long etc.
 */
public class Input_Output {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // If i am taking input from my keyboard i will use System.in

        // String str = input.nextLine();

        // float num = 123.35f;
        // double num1 = 124.5436;

        System.out.println("Please enter your Roll Num - ");
        int n = input.nextInt();

        int million = 234_000_000; // If i wnat to write million i can not use comma here instead i can use _ this
                                   // and internally this will be removed and replaced by comma.

        float marks = input.nextFloat();

        System.out.println("Your Roll Num is - " + n);
        System.out.println(marks);
        System.out.println(million);

        input.close();
    }

}