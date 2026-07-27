import java.util.*;

public class basicFunctions {
    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3;
    }

    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("sum is: "+sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b);
    }
}
