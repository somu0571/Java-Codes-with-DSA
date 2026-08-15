import java.util.Arrays;

public class Assignment1 {

    // Bubble Sort (Descending)
    public static void bubbleSortDescending(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort (Descending)
    public static void selectionSortDescending(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    // Insertion Sort (Descending)
    public static void insertionSortDescending(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    // Counting Sort (Descending)
    public static void countingSortDescending(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;

        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, 8, 6, 2, 7, 1, 4 };

        int bubble[] = arr.clone();
        int selection[] = arr.clone();
        int insertion[] = arr.clone();
        int counting[] = arr.clone();

        bubbleSortDescending(bubble);
        selectionSortDescending(selection);
        insertionSortDescending(insertion);
        countingSortDescending(counting);

        System.out.println("Original Array      : " + Arrays.toString(arr));
        System.out.println("Bubble Sort         : " + Arrays.toString(bubble));
        System.out.println("Selection Sort      : " + Arrays.toString(selection));
        System.out.println("Insertion Sort      : " + Arrays.toString(insertion));
        System.out.println("Counting Sort       : " + Arrays.toString(counting));
    }
}
