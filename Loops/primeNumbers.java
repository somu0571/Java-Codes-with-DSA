import java.util.*;

public class primeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int flag = 1;
        if(n == 0 || n == 1) {
            flag = 0;
        }

        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                flag = 0;
                break;
            }
        }
        if(flag != 1) {
            System.out.println("It's not a prime number");
        } else {
            System.out.println("Number is Prime");
        }
    }
}
