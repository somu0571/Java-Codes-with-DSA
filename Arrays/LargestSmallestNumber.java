import java.util.*;

public class LargestSmallestNumber {
    
    public static void getLargestAndSmallest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        getLargestAndSmallest(numbers);
    }
}

