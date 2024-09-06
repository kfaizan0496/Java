package interview;

public class TwoSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,-3,8,-2,-5,9};
      int x=-7;
      int size=arr.length;
      if(checkPair(arr,,x)) {
    	  System.out.println("yes");
      }else {
    	  System.out.println("no");
      }

}

	public static boolean checkPair(int[] arr, int size,int x) {
		// TODO Auto-generated method stub
		for(int i=0;i<(size-1);i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]+arr[j]==x) {
					return true;
				}
			}
		}
		
		
		return false;
	}
}