package arrays;

public class RotationArray {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void rotateArray(int[] arr,int k) {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return;
			
		}
		if(k>=arr.length && arr.length!=0) {
			k%=arr.length;
			
		}
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length-1);
		
		
	}
	
	public static void reverse(int[] arr,int start,int end) {
		while(start<end) {
			swapElements(arr,start,end);
			start++;
			end--;
		}
	}
	
	public static void swapElements(int[] arr,int start,int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,3,1,5,9,8};
		rotateArray(arr,2);
		
		printArray(arr);
	}




	

}
