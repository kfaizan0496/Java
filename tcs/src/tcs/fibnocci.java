package tcs;

import java.util.Scanner;

public class fibnocci {
	
	public static int fibnocci(int n) {
		int a=1,b=1,c=1;
	for(int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int result=fibnocci(n);
 System.out.println(result);
		
		
	}

}
