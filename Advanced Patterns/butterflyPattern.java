public class butterflyPattern {
    public static void butterfly(int n) {
        // 1st Half
        for(int i=1; i<=n; i++) {
            // stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }

        // 2nd Half
        for(int i=n; i>=1; i--) {
            // stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        butterfly(5);
    }
}

