package arrays;

import java.util.Scanner;

public class AddDigitsOfNumber {
	private static void addDigits(int num) {
		// TODO Auto-generated method stub
		int temp=num;
		int ans=0;
		while(temp>0) {
			int remainder=temp%10;
			ans=ans+remainder;
			temp=temp/10;
			
			
		}
		int newAns=0;
		while(ans>0) {
			int remainder=ans%10;
			newAns=newAns+remainder;
			ans=ans/10;
			
		}
		System.out.println(newAns);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		addDigits(num);
		
		
		
	}

	

}
