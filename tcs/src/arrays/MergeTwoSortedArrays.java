package arrays;

public class MergeTwoSortedArrays {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] merge2SortedArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int m=arr1.length;
		int n=arr2.length;
		int arr3[]=new int [m+n];
		int i=0;
		int j=0;
		int k=0;
		while(i<m && j<n) {
			
			if(arr1[i]>arr2[j]) {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
			else {
				arr3[k]=arr1[i];
				i++;
				k++;
			}
		}
		
		
		while(i<m) {
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		while(j<n) {
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
		
		
		return arr3;
	}

	
	
	
	
	
	

public static void main(String[] args) {
	int arr1[]= {1,4,8,10,13,17};
	int arr2[]= {2,3,5,7,9,11,12};
	int arr3[]=merge2SortedArrays(arr1,arr2);
	printArray(arr3);
	
}
}

