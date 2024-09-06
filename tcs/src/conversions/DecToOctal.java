package conversions;

import java.util.Scanner;

public class DecToOctal {
	
	public static void decToOct(int num) {
		// TODO Auto-generated method stub
		int i=0;
		int binaryArray[]=new int[100];
		while(num!=0) {
			binaryArray[i]=num%8;
			num=num/8;
			i++;
		}
		for(int j=i;j>=0;j--) {
			System.out.print(binaryArray[j]+" ");
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
	     decToOct(Num);
		

	}

	

}
