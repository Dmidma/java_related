import java.util.ArrayList;


public class RunLength {

	public String runLength(String str) {
		
		
		//I am using StringBuilder because I can delete chars from the string
		//I am also adding a space at the end of the string so the while loops work
		//without reaching the Exception on index out of bound
		StringBuilder strTmp = new StringBuilder(str + " ");
		
		//We start by adding all the existing letters in str in an Array
		//We also add each words in order with no repetition
		ArrayList<Character> charArray = new ArrayList<Character>();
		
		charArray.add(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1))
				charArray.add(str.charAt(i));
		}
		
		//Now we create an integer array which will hold the number of repetition of each letter in order
		int [] repArray = new int[charArray.size()];
		
		for (int i = 0; i < charArray.size(); i++) {
			while (charArray.get(i) == strTmp.charAt(0)) {
				repArray[i]++;
				strTmp.deleteCharAt(0);
			}
		}
		
		//We then run through the repArray and the CharArray concatenating them in resultStr 
		String resultStr = "";
		for (int i = 0; i < charArray.size(); i++)
			resultStr += String.valueOf(repArray[i]) + String.valueOf(charArray.get(i));
		
		return resultStr;
	}
}
