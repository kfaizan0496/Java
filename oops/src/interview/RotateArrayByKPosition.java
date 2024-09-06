package interview;

public class RotateArrayByKPosition {
public static void main(String[] args) {
	int arr[] ={3,4,7,34,2,5,89};
	int n=arr.length;
	int d=2;
	rotateArray(arr,n,d);
	printArray(arr);
}

public static void printArray(int[] arr) {
	// TODO Auto-generated method stub
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	
}

public static void rotateArray(int[] arr, int n, int d) {
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
}
