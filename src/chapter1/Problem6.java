package chapter1;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcccccaaa";
		
		String res = compressedString(str);
		System.out.println(res);
	}
	
	public static String compressedString(String s) {
		
		StringBuilder compressed = new StringBuilder();
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			count++;
			
			if(i+1 >=s.length() || s.charAt(i)!=s.charAt(i+1)) {
				compressed.append(s.charAt(i));
				compressed.append(count);
				count = 0;
			}
		}
		return compressed.length()<s.length() ? compressed.toString() : s;
	}

}
