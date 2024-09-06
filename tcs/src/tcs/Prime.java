package tcs;

import java.util.Scanner;

public class Prime {
	
	public static boolean isCheckPrime(int n) {
	int div=2;
	while(div<n) {
		if(n%div==0) {
			System.out.println("composite");
			return false;
			
		}
		div=div+1;
	}
	return true;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(isCheckPrime(n));
}
}
