
public class LetterCapitalize {
	
	public String letterCapitalize(String str) {
		
		StringBuilder tmp = new StringBuilder(str);
		
		int i = 0;
		
		//We check the first char of the string if it is a letter we capitalize it
		if (Character.isLetter(str.charAt(i)))
			tmp.setCharAt(i, Character.toUpperCase(str.charAt(i)));
		
		
		//We run over the str, if we find a space the next letter will be capitalized
		//If a space exist at the end of the str, we do not count it 
		while (i != str.length()) {
			if (str.charAt(i) == ' ' && i != (str.length() - 1))
				tmp.setCharAt(i + 1, Character.toUpperCase(str.charAt(i + 1)));
			
			i++;
		}
		
		
		return tmp.toString();
	}

}
