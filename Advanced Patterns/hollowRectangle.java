public class hollowRectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // print space instead of newline
                }
            }
            System.out.println(); // move to next row
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4, 5);
    }
}

