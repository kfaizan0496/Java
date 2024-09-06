package conversions;

import java.util.Scanner;

public class DecToHex {
	
	public static void decToHexa(int num) {
		// TODO Auto-generated method stub
		char[] hexa= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexaValues="";
		while(num!=0) {
			int remainder=num%16;
			hexaValues=hexa[remainder]+hexaValues;
			num=num/16;
			
		}
		
		
		
		for(int i=0;i<hexaValues.length();i++) {
			System.out.print(hexaValues.charAt(i)+" ");
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
	     decToHexa(Num);
		

	}

	

}
