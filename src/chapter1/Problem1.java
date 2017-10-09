package chapter1;

import java.util.Arrays;

/*
 * Determine whether the given string has all unique characters.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		boolean result = IsUniqueWithoutDS(str);
		System.out.println(result);
		scan.close();
	}
	
	/*
	 * Using Map and checking if character is already in the map or not.
	 * O(n) since in worst case when all are unique so loop will go for length of string
	 */
	public static boolean IsUnique(String s) {
		/*
		 * in case the length of the string is 0 or 1.
		 * In case of 0, it should return false and if it is 1, then it will be unique.
		 */
		
		if(s.length() == 0) {
			return false;
		}
		else if(s.length()==1) {
			return true;
		}
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			if(map.containsKey(ch)) {
				return false;
			}
			else {
				map.put(ch, 1);
			}
		}
		return true;
	}
	
	/*
	 * this will simply create a boolean array
	 */
	public static boolean IsUniqueWithoutDS(String s) {
		
		if(s.length() == 0) {
			return false;
		}
		else if(s.length()==1) {
			return true;
		}
		
		boolean[] charArray = new boolean[128];
		for(int i=0;i<s.length();i++) {
			if(charArray[s.charAt(i)]) {
				return false;
			}
			else {
				charArray[s.charAt(i)] = true;
			}
		}
		return true;
	}
	
	/*
	 * without any data structure.
	 */
	
	public static boolean isUniqueWithoutDataStructure(String word) {
		for(int i=0;i<word.length()-1;i++) {
			for(int j=i+1;j<word.length();j++) {
				if(word.charAt(i) == word.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
