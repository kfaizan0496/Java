package arrays;

import java.util.Scanner;

public class ReplaceAll0sWith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
 
		int num=sc.nextInt();
		replaceAllZeroWith5(num);
		
	}

	public  static void replaceAllZeroWith5(int num) {
		// TODO Auto-generated method stub
		int temp=num;
		int answer=0;
		while(temp>0) {
			int remainder=temp%10;
			if(remainder==0) {
				remainder=5;
				
			}
			answer=answer*10+remainder;
			temp=temp/10;
		}
		reverse(answer);
		
	}

	private static void reverse(int ans) {
		// TODO Auto-generated method stub
		int newAnswer=0;
		while(ans>0) {
			int remainder=ans%10;
			
			newAnswer=newAnswer*10+remainder;
			ans=ans/10;
			
			
			
		}
		System.out.print(newAnswer);
		
	}

}
