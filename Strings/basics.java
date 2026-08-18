import java.util.*;
public class basics {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.println(name);
        

        // length();
        String fullname = "Tony Stark";
        System.out.println(fullname.length());

        // concatenation
        String firstName = "Shradha";
        String lastName = "Khapra";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }
}
