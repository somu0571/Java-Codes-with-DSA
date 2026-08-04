import java.util.*;
public class createArray {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : " +marks[0]);
        System.out.println("chem : " +marks[1]);
        System.out.println("Length of Array : "+marks.length); // use to calculate size of an array
    }
}
