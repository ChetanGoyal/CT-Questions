package chapter1;

public class Problem5 {

	public static void main(String[] args) {
		String s1 = "pal";
		String s2 = "bale";
		
		boolean isOneEditAway = editAway(s1,s2);
		System.out.println(isOneEditAway);
	}
	
	public static boolean editAway(String str1,String str2) {
		if(str1.length() == str2.length()) {
			return oneEditAway(str1,str2);
		}
		else if(str1.length()+1 == str2.length()) {
			return oneEditInsert(str1,str2);
		}
		else if(str1.length()-1 == str2.length()) {
			return oneEditInsert(str2,str1);
		}
		else
			return false;

	}
	
	public static boolean oneEditAway(String first,String second) {
		boolean foundDifference = false;
		for(int i=0;i<first.length();i++) {
			if(first.charAt(i)!=second.charAt(i)) {
				if(foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}
	
	public static boolean oneEditInsert(String first,String second) {
		int index1 = 0;
		int index2 = 0;
		
		while(index1<first.length() && index2<second.length()) {
			if(first.charAt(index1)!=second.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				else
					index2++;
			}
			else {
				index1++;
				index2++;
			}
				
		}
		return true;
	}

}
