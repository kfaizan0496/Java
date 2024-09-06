package arrays;

public class RotationArray2Approach {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void rotateArray(int[] arr,int n,int d) {
		// TODO Auto-generated method stub
		int temp[]=new int[n];
		int k=0;
		for(int i=d;i<n;i++) {
			temp[k]=arr[i];
			k++;
			
		}
		
		for(int i=0;i<d;i++) {
			temp[k]=arr[i];
			k++;
			
		}
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
			
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,3,1,5,9,8};
		int n=arr.length;
		rotateArray(arr,n,2);
		
		printArray(arr);
	}




	

}
