package arrays;

public class FindAllFactors {
	
	public static void findFactors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findFactors(60);
		
	}

}
