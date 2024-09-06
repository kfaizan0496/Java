package interview;

public class MissingNumber {
	
	public static int  getMissingNo(int[] arr, int length) {
		// TODO Auto-generated method stub
		int sum=0;
		int N=length+1;
		for(int i=0;i<length;i++) {
			sum=sum+arr[i];
			
		}
		return ((N*(N+1))/2-sum);
		
	}
	
	
	
	
public static void main(String[] args) {
	 int[] arr = { 1, 2, 3, 5 };
     int length = arr.length;
     System.out.println(getMissingNo(arr, length));
}


}
