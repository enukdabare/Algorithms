package SortingMethods;
import java.util.Scanner;

public class BubbleSort {

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
		
		//int arr[] = {1,8,7,6,9,5,3};
		int length = arr.length;
		System.out.print("Unsorted Array: ");
		for(int i=0; i<length; i++)
			System.out.print(arr[i] + " ");
		
		for(int i=0; i<length; i++) {
			for(int j=1; j<length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Sorted Array: ");
		for(int i=0; i<length; i++)
			System.out.print(arr[i] + " ");

	}

}
