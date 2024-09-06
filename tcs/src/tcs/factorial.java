package tcs;

import java.util.Scanner;

public class factorial {
	
	
	private static int factorialNum(int n) {
		// TODO Auto-generated method stub
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=factorialNum(n);
		System.out.println(result);
	}

	
	
	
	
}
