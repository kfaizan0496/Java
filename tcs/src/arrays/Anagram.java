package arrays;

import java.util.Arrays;

public class Anagram {
	public static boolean checkAnagram(char[] string1, char[] string2) {
		// TODO Auto-generated method stub
		if(string1.length!=string2.length) {
			return false;
		}
		Arrays.sort(string1);
		Arrays.sort(string2);
		for(int i=0;i<string2.length;i++) {
			if(string1[i]!=string2[i]) {
				return false;
			}
		}
		
		
		
		
		return true;
	}

	
	
	
	
	public static void main(String[] args) {
		String str1="Silent";
		String str2="Listen";
		
	str1=	str1.toLowerCase();
	str2=	str2.toLowerCase();
		
		char [] string1=str1.toCharArray();
		char [] string2=str2.toCharArray();
		System.out.println(checkAnagram(string1,string2));
		
	
		
	}

	
}
