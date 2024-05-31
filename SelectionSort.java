package SortingMethods;
import java.util.Scanner;

public class SelectionSort {

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
		
		int length = arr.length;
		System.out.print("Unsorted Array: ");
		for(int i=0; i<length; i++)
			System.out.print(arr[i] + " ");
		
		for(int i=0; i<length-1; i++) {
			int min = i;
			for(int j=i+1; j<length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println();
		System.out.print("Sorted Array: ");
		for(int i=0; i<length; i++)
			System.out.print(arr[i] + " ");

	}

}
