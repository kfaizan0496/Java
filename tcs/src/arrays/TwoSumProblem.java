package arrays;

public class TwoSumProblem {
	
	public static boolean checkPair(int []arr,int x,int size) {
	for(int i=1;i<size-1;i++) {
		
		for(int j=i+1;j<size;j++) {
			if(arr[i]+arr[j]==x) {
				return true;
				
			}
			 
		}
	}
			
	return false;	
	}	
	
	
public static void main(String[] args) {
	int arr[]= {2,-7,4,-6,3,5,-5};
	int x=-6;
	int size=arr.length;
	System.out.println(checkPair(arr,x,size));
	
}
}
