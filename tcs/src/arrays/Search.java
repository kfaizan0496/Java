package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	public static int binarySearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return -1;
		}
		
		int start=0,end=(arr.length-1);
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]>x) {
				end=mid-1;
			}else if(arr[mid]<x) {
				start=mid+1;
			}
		}
	
		return -1;
	}
	
	
	
	
	
	public static int linearSearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
			
		}
		return -1;
	}
	
	
	
	
public static int[] takingInput(int[] arr) {
		
		Scanner  sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
				return arr;
	}	

	
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	takingInput(arr);
//	int index=linearSearch(arr,54);
//	System.out.println("index of 54 is "+index);
	Arrays.sort(arr);
	printArray(arr);
	int result=binarySearch(arr, 80);
	System.out.println("index  of 80 in  binary search is "+result );
}



}
