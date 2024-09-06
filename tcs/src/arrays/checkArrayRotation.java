package arrays;

public class checkArrayRotation {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static int checkArrayRotation(int[] arr) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				return (i+1);
			}
		}
		return 0;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,1,2,3,};
		int result=checkArrayRotation(arr);
		System.out.println(result);
		
		printArray(arr);
	}




	

}
