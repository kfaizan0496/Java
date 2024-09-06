package conversions;

import java.util.Scanner;

public class BinaryToDec {
	
	public static void binaryToDec(int num) {
		// TODO Auto-generated method stub
		int placeValue=1;
		int answer=0;
		while(num!=0) {
			int remainder=num%10;
			answer=answer+placeValue*remainder;
		     placeValue=2*placeValue;
		     num=num/10;
		}
		System.out.println(answer);
		}
		
		
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
	     binaryToDec(Num);
		

	}

	

}
