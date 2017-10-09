package chapter1;

public class Problem9 {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		String s1s1 = s1+s1;
		
		boolean result = isSubstring(s1s1,s2);
		System.out.println(result);
	}
	
	public static boolean isSubstring(String Big, String small) {
		if(Big.indexOf(small)>0) {
			return true;
		}
		else
			return false;
	}

}
