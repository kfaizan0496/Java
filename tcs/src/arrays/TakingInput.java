package arrays;

import java.util.Scanner;

public class TakingInput {
	
	public static int[] takingInput(int[] arr) {
		
		Scanner  sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		return arr;
	}
	
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	takingInput(arr);
	printArray(arr);
	

	
}
}
