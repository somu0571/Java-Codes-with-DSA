public class kadaneAlgo {
    public static void kadane_Algo(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int n = numbers.length;
        for(int i=0; i<n; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            if(ms == 0) {
                ms = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max subarray sum is : "+ms);
    }
    public static void main(String args[]) {
        int nums[] = {-1,-2,-3,-4,-5,-6};
        kadane_Algo(nums);
    }
}
