// import java.util.*;

// public class Assignment {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int number;
//         int choices;
//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             System.out.println("Enter the number");
//             number = sc.nextInt();

//             if( number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }

//             System.out.println("Do you want to continue ? Press 1 for yes or O for no");

//             choices = sc.nextInt();
//         } while( choices == 1);

//         System.out.println("Sum of even number: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//     }
// }

// import java.util.*;

// public class Assignment {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int fact = 1;

//         System.out.println("Enter any positive integer: ");
//         num = sc.nextInt();

//         for(int i=1; i<=num; i++) {
//             fact *= 1;
//         }

//         System.out.println("Factorial: "+ fact);
//     }
// }

import java.util.*;

public class Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
