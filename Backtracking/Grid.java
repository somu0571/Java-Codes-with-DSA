package Backtracking;

public class Grid {
    public static int gridways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }
        return gridways(i, j + 1, n, m) + gridways(i + 1, j, n, m);
    }

    public static void main(String[] args) {
        System.out.println(gridways(0, 0, 3, 3));
    }
}
