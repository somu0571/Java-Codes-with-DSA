// public class Assignment {
//     public static double AvgSum(int a, int b, int c) {
//         return (a+b+c)/3;
//     }
//     public static void main(String args[]) {
//         int a = 5;
//         int b = 6;
//         int c = 12;

//         double res = AvgSum(a,b,c);
//         System.out.print("The Average of 3 Numbers is : "+res);
//     }
// }

// import java.util.*;
// public class Assignment {
//     public static boolean isEven(int n) {
//         if(n % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num;

//         System.out.print("Enter an Integer");
//         num = sc.nextInt();

//         if(isEven(num)) {
//             System.out.println("Number is Even");
//         } else {
//             System.out.println("Number is Odd");
//         }
//     }
// }

// Palindrome
// import java.util.*;

// public class Assignment {
//     public static boolean isPalindrome(int n) {
//         int palindrome = n;
//         int rev = 0;

//         while(palindrome != 0) {
//             int rem = palindrome % 10;
//             rem = rev * 10 + rem;
//             palindrome = palindrome / 10;
//         }

//         if(n == rev) {
//             return true;
//         }

//         return false;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int palindrome = sc.nextInt();

//         if(isPalindrome(palindrome)) {
//             System.out.println("Number : "+ palindrome + " is a palindrome");
//         } else {
//             System.out.println("Number : " + palindrome + "is not a palindrome");
//         }
//     }
// }

import java.util.*;

public class Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an Integer : ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }

        return sumOfDigits;
    }
}
