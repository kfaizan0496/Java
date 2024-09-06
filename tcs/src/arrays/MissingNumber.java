package arrays;

public class MissingNumber {
	
	public static int checkMissing(int[] arr,int length) {
		// TODO Auto-generated method stub
		
		int N=length+1;
		
		int sum=0;
		
		for(int i=0;i<length;i++) {
			sum=sum+arr[i];
		}
		return (N*(N+1)/2)-sum;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {1,2,3,4,5,6,7,9};
		int length=arr.length;
		int missingNumber=checkMissing(arr,length);
		
		System.out.println(missingNumber);
		

	}

	

}
