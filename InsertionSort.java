package SortingMethods;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	public static int[] insertionSort(int[]arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i;
			while((j>0) && (arr[j-1]>arr[j])) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j--;
		}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		System.out.println("Enter Array Size: ");
		num = in.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<num; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.print("Unsorted Array: ");
		System.out.println(Arrays.toString(arr));
		
		arr = insertionSort(arr);
		
		System.out.println();
		System.out.print("Sorted Array: ");
		System.out.println(Arrays.toString(arr));

}
}
