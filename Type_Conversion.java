import java.util.Scanner;

/**
 * Type_Conversion
 * chote se bade datatype me ye kudh badal lega. eg- int -> float , int ->
 * double , float->double
 * but bade se chote me hume kudh isko batana pade ga. eg- float -> int (Yaha
 * hume batana pade ga) (Aur issi process ko type casting kethe hai) (Specially
 * Narrowing conversion)
 * 
 * Float se int -> int num = (int)(543.342) (Ye hai shai rasta)
 * 
 */
public class Type_Conversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 257;
        byte b = (byte) (a);

        System.out.println(b);

        input.close();
    }
}