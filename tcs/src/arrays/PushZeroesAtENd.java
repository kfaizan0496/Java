package arrays;

public class PushZeroesAtENd {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void pushZeroAtENd(int arr[]){
		int nonZeroes=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[nonZeroes];
				arr[nonZeroes]=temp;
				
				nonZeroes++;
				
			}
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,0,8,0,0,17,56,0,45,67};
		pushZeroAtENd(arr1);
		printArray(arr1);
		

	}

}
