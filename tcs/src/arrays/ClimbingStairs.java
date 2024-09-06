package arrays;

public class ClimbingStairs {
	/* 
 input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
	  */
	
	 public static int climbStairs(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return climbStairs(n-1) + climbStairs(n-2);
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=climbStairs(4);
		System.out.println(result);
        

	}

}
