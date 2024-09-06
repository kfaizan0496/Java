package tcs;

import java.util.Scanner;

public class palendrome {

	public static boolean isCheckPalendrome(int n) {
		int temp=n;
		int result=0;
		while(temp>0) {
			int remainder=temp%10;
			result=result*10+remainder;
			temp=temp/10;
			}
		if(result==n) {
			return true;
		}
		return false;
		
			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isCheckPalendrome(n));
	}
}

