package SortingMethods;

public class ModifiedBubbleSort {
	
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 8};
        int n = arr.length;
        int step = 0;
        int end = n - 1;
        boolean Sorted = false;
        
        while (!Sorted) {
            step++;
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                Sorted = true;
            } else {
                end--;
            }
        }
        
        System.out.println("number of steps = " + step);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}



