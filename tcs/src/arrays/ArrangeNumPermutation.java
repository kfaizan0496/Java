package arrays;

import java.util.Scanner;

public class ArrangeNumPermutation {
	
	
	public static void circularArrange(int n) {
		// TODO Auto-generated method stu
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		System.out.println(ans);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given N, the number of persons. The task is to arrange N person around a circular table.
		 Scanner sc=new Scanner(System.in);
		 
			int n=sc.nextInt();
			circularArrange(n-1);
		
      
	}

	

}
