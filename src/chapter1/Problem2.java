package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pairs = { { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" }, { "hell", "check" } };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutationMap(word1, word2);
			System.out.println(anagram);
		}

	}

	/*
	 * This will use only one array and then by iterating that array two times, will
	 * check if it is a permutation string or not
	 * 
	 */
	public static boolean permutation(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}
		int[] array = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			array[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			array[s2.charAt(i)]--;
			if (array[s2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Using the sort function.
	 * 
	 */

	public static String sort(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}

	public static boolean permutationSort(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	
	/*
	 * Using maps. Will increase the space complexity since it will require two maps.
	 */
	
	public static boolean permutationMap(String s1,String s2) {
		
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		Map<Character,Integer> map2 = new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length();i++) {
			Character ch = s1.charAt(i);
			if(map1.containsKey(ch)) {
				int val = map1.get(ch);
				++val;
				map1.put(ch, val);
			}
			else {
				map1.put(ch,1);
			}
		}
		for(int i =0;i<s2.length();i++) {
			Character ch = s2.charAt(i);
			if(map2.containsKey(ch)) {
				int val = map2.get(ch);
				++val;
				map2.put(ch,val);
			}
			else {
				map2.put(ch,1);
			}
		}
		
		if(map1.equals(map2))
			return true;
		else
			return false;
	}
}
