public class invertedRotatedHalfPyramid {
    public static void inverted_rotated_half_pyramid(int n) {
        // for Outer Loop
        for(int i=1; i<=n; i++) {
            // for Blank Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // for Stars Printing
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_rotated_half_pyramid(4);
    }
}
