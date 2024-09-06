package interview;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,5,2,7,4,8};
       System.out.println(checkDuplicate(arr));
	}

	public static boolean checkDuplicate(int arr[]) {
		
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		
		
		return false;
	}

}
