package pattern;

import java.util.Scanner;

public class Pattern3 {
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			char p=(char)('A'+i-1);
			for(int j=1;j<=n;j++) {
			
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
	
	
}
}
