package conversions;

import java.util.Scanner;

public class ValidPerfectSquare {
     
	public static boolean isValidPerfectSquare(int n) {
		double side=Math.sqrt(n);
		if(side*side==n) {
			return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		System.out.println(isValidPerfectSquare(n));

	}

}
