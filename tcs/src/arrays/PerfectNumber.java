package arrays;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isValidPerfectNumber(int n) {
		int temp=n;
		int ans=0;
		int div=1;
		while(temp>div) {
			if(temp%div==0) {
			ans=ans+div;
			

			}
			div++;
			
		}
		
		if(n==ans) {
			return true;
		}
		
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		System.out.println(isValidPerfectNumber(n));

	}
}
