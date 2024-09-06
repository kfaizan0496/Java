package arrays;

import java.util.Scanner;

public class AddTwoFractions {
	
	public static void addTwoFractions(int numerator1, int denominator1, int numerator2, int denominator2) {
		// TODO Auto-generated method stub
		int hcf=gcd(denominator1,denominator2);
		int denominator3=(denominator1*denominator2)/hcf;
		
		int numerator3=(denominator3/denominator1)*numerator1+(denominator3/denominator2)*numerator2;
		lowestForm(numerator3,denominator3);
		
	}
	
	
	

	public  static void lowestForm(int numerator3, int denominator3) {
		// TODO Auto-generated method stub
		int commonFactor=gcd(numerator3,denominator3);
		
		numerator3=numerator3/commonFactor;
	    denominator3=	denominator3/commonFactor;
	    System.out.println(numerator3+"/"+denominator3);
	}




	public static int gcd(int denominator1, int denominator2) {
		// TODO Auto-generated method stub
		if(denominator1==0) {
			return denominator2;
			
		}
		if(denominator2==0) {
			return denominator1;
			
		}else {
	          return 	 gcd(denominator2%denominator1, denominator1);
	         }
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Numerator 1 and Denominator 1");
		int numerator1=sc.nextInt();
		int denominator1=sc.nextInt();
		
		System.out.println("Enter the value of Numerator 1 and Denominator 1");
		int numerator2=sc.nextInt();
		int denominator2=sc.nextInt();
		
		addTwoFractions(numerator1,denominator1,numerator2,denominator2);
		
	}

	

}
