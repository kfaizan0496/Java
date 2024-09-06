package tcs;

import java.util.Scanner;

public class Armstrong {
	
	
public static boolean isArmstrong(int n) {
	
	int temp=n;
	int result=0;
	
	while(temp>0) {
		int remainder=temp%10;
		 result=result+remainder*remainder*remainder;
		temp=temp/10;
		
	}
	if(n==result) {
		return true;
	}
	
	
	
return false;	
	
}	
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(n+" "+"is Armstrong ? "+isArmstrong(n));
	
}
}
