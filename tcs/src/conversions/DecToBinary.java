package conversions;

import java.util.Scanner;

public class DecToBinary {
	
	public static void decToBinary(int num) {
		// TODO Auto-generated method stub
		int i=0;
		int binaryArray[]=new int[100];
		while(num!=0) {
			binaryArray[i]=num%2;
			num=num/2;
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
	     decToBinary(Num);
		

	}

	

}
