package arrays;

public class LeapYear {
   
	public static boolean isLeapYear(int year) {
		if((year%400==0 ) || (year%100!=0 && year%4==0)) {
			return  true;
		}
		
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2020));

	}

}
