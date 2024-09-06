package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
   Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
   Output : 10 3
         20 4
         5  1

  Input : arr[] = {10, 20, 20}
  Output : 10 1
         20 2  
 * */






public class CheckFrequency {
	
	
	public static void countFreq(int[] arr, int n) {
		// TODO Auto-generated method stub
		boolean visited[]=new boolean[n];
		Arrays.fill(visited,false);
		
		for(int i=0;i<n;i++) {
			int count=1;
			if(visited[i]==true) {
				continue;
			}
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
					
					
				}
			}
			System.out.println(arr[i]+" "+count);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
	        int n = arr.length;
	        countFreq(arr, n);
		 
			
	}

	

}
