package chapter1;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

	public static void main(String[] args) {
		String str = "Ratzs live on n";
		
		boolean result = IsPalindrome(str);
		System.out.println(result);
	}
	
	public static boolean IsPalindrome(String s) {
		
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : s.toCharArray()) {
			if(map.containsKey(ch)) {
				int val = map.get(ch);
				++val;
				map.put(ch, val);
			}
			else {
				map.put(ch, 1);
			}
		}
		int count = 0;
		for(char ch : map.keySet()) {
			int val = map.get(ch);
			if(val % 2 == 1) {
				count++;
			}
			else {
				count--;
			}
		}
		return count<=1;
	}

}
