import java.util.Arrays;

public class VariableArguments {
    static void func(int... arguments) {
        System.out.println(Arrays.toString(arguments));
    }

    public static void main(String[] args) {
        func(1, 2, 3, 4, 5, 6, 7, 8);
        func(null);
        func();
    }
}
