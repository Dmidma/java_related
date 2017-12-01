
public class PalindromeTwo {
	
	public String palindromeTwo(String str) {
		
		//We start first by removing all the non alphabetic characters in the str
		StringBuilder tmpStr = new StringBuilder(str);
		
		int i = 0;
		while (i < tmpStr.length())
			if (!Character.isAlphabetic(tmpStr.charAt(i)))
				tmpStr.deleteCharAt(i);
			else 
				i++;
		
		//Next, we make them all lower case
		for (i = 0; i < tmpStr.length(); i++)
			tmpStr.setCharAt(i, Character.toLowerCase(tmpStr.charAt(i)));
		
		
		//Now we test if it the first char is equal to the last one
		//on and on until we reach the middle of str
		//If not we return false immediately
		for (i = 0; i < (tmpStr.length() / 2); i++)
			if (tmpStr.charAt(i) != tmpStr.charAt(tmpStr.length() - 1 -i))
				return "false";
		
		return "true";
	}
}
