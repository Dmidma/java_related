import java.util.ArrayList;


public class LetterCountI {
	
	public String letterCountI(String str) {
		
		
		/*
		 * We start by putting only the words in a list
		 * No spaces no punctuation  
		 */
		ArrayList<String> strArray = new ArrayList<String>();
		String tmpStr = "";
		str += " "; //We add a space to the end of the String, so we can take the last word.
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				tmpStr += str.charAt(i);
			} else {
				if (tmpStr.length() > 0)
					strArray.add(tmpStr);
				tmpStr = "";
			}
		}
		
		
		/*
		 * We go through strArray giving each word an array representing the number 
		 * of alphabetic letter in it.
		 * I have added two cases in asciiArray, the last one for the number of repeated letters.
		 * The one before the last is a value = the repeated letter * index of the ascii letter
		 * a is 0 and z is 26
		 * this value will determine which word has more priority than the other if we have the 
		 * same number of repeated letters
		 */
		int [][] asciiArray = new int[strArray.size()][28];
		for (int i = 0; i < strArray.size(); i++) {
			for (int j = 0; j < strArray.get(i).length(); j++) {
				asciiArray[i][((int)Character.toLowerCase(strArray.get(i).charAt(j)) - 97)] += 1;
			}
		}
		
	
		boolean notOne = false; //If all the words has no repeated letters; this value stays false
		for (int i = 0; i < strArray.size(); i++) {
			for (int j = 0; j < 26; j++) {
				if (asciiArray[i][j] > 1) {
					notOne = true;
					asciiArray[i][27] += asciiArray[i][j];
					asciiArray[i][26] += (asciiArray[i][j] * j);
					
				}
			}
		}
		if (!notOne)
			return "-1";
		/*
		 * We go through the asciiArray looking for the word that contains the most repeated
		 * letters.
		 * If all the words have the same number of repeated letters, we found the least value
		 * contained in the case before the last.
		 */
		int indexMostRep = 0;
		for (int i = 1; i < strArray.size(); i++) {
			if (asciiArray[i][27] > asciiArray[indexMostRep][27])
				indexMostRep = i;
			else if (asciiArray[i][27] == asciiArray[indexMostRep][27])
				if (asciiArray[i][26] < asciiArray[indexMostRep][26])
					indexMostRep = i;
		}
		
		
		return strArray.get(indexMostRep);
	}

}
