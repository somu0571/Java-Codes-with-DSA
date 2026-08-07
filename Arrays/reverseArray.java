public class reverseArray {
    public static void reverse(int num[]) {
        int start = 0;
        int end = num.length-1;

        while(start < end) {
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};

        reverse(numbers);
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]+"");
        }
        System.out.println();
    }
}