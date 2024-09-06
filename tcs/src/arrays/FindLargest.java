package arrays;

import java.util.Scanner;

public class FindLargest {
	
	
	
	
public static int[] takingInput(int[] arr) {
		
		Scanner  sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
				return arr;
	}	



public static int findLargestNum(int[] arr) {
	
	int largest=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			
			largest=arr[i];
		}
		
	}
	
	
	return largest;
	
	
	
}

public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	takingInput(arr);
	int result=findLargestNum(arr);
	System.out.println(result);
	
	
}
}
