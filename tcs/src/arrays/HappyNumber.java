package arrays;

import java.util.Scanner;

public class HappyNumber {
	
	
	public static void happyNumber(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return ;
		}
		
		int sum=0;
		int temp=num;
		while(temp>9) {
			while(temp>0) {
			    int remainder=temp%10;
			    sum=sum+remainder*remainder;
			    temp=temp/10;
			}
			temp=sum;
			sum=0;
			
		}
		if(temp==1) {
			System.out.println("Happy Number");
		}else {
			System.out.println("Not a happy Number");
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 
			int num=sc.nextInt();
			happyNumber(num);
	}

	

}
