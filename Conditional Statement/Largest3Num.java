public class Largest3Num {
    public static void main(String args[]) {
        int A = 5;
        int B = 4;
        int C = 7;

        if((A >= B) && ( A >= C)) {
            System.out.println("A is Largest");
        } else if(( B >= A) && ( B >= C)) {
            System.out.println("B is Largest");
        } else {
            System.out.println("C is Largest");
        }
    }
}
