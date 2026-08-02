import java.util.*;
public class factorialCalc {
    public static int fact(int n) {
        int f=1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fact(n);
        System.out.print("The Factorial is : "+res);
    }
}
