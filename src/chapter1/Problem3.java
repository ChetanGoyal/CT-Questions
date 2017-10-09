package chapter1;

public class Problem3 {

	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] array = str.toCharArray();
		int trueLength = findLastCharacter(array) + 1;
		replaceSpaces(array, trueLength);	
	}
	
	public static int findLastCharacter(char[] chArray) {
		for(int i = chArray.length-1;i>=0;i--) {
			if(chArray[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	
	public static void replaceSpaces(char[] str, int trueLength) {
		//count the number of spaces in the string.
		int spaceCount = 0;
		int index,i = 0;
		for(i=0;i<trueLength;i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		
		index = trueLength + spaceCount*2;
		if(trueLength < str.length) {
			str[trueLength] = '\0';    //Marking the ending of array.
		}
		for(i = trueLength-1;i<=0;i--) {
			if(str[i] == ' ') {
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index = index-3;
			}
			else {
				str[index-1] = str[i];
				index--;
			}
		}
	}

}
