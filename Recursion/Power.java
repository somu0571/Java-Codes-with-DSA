public class Power {
    public static int pow(int x, int n) {
        if( n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    public static int optimizePow(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPowSq = optimizePow(a, n/2) * optimizePow(a, n/2);
        if(n % 2 != 0) {
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String args[]) {
        System.out.println(pow(5,2));
        System.out.println(optimizePow(10, 2));
    }
}
