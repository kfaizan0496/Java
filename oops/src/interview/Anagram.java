package interview;

import java.util.Arrays;

public class Anagram {
	
	public static boolean checkAnagram(char[] string1, char[] string2) {
		// TODO Auto-generated method stub
		if(string1.length!=string2.length) {
			return false;
		}
		Arrays.sort(string1);
		Arrays.sort(string2);
		for(int i=0;i<string1.length;i++) {
			if(string1[i]!=string2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      String str1="Silent";
//      String str2="Listen";
      String str1="gram";
      String str2="arm";
      str1= str1.toLowerCase();
      str2=str2.toLowerCase();
      char string1 []=str1.toCharArray();
      char string2 []=str2.toCharArray();
      System.out.println(checkAnagram(string1,string2));
      System.out.println(str1+str2);
	}

	

}
