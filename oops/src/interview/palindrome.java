package interview;

public class palindrome {
	
	
	public static boolean checkPalindrome(int num) {
		// TODO Auto-generated method stub
		
		int temp=num;
		int reverse=0;
		int remainder=0;
		while(temp>0) {
			remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
			
		}
		
		
		if(reverse==num) {
			return true;
		}
		
		return false;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=12212;
       System.out.println(checkPalindrome(num));
	}

	
}
