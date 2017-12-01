
public class SimpleSymbols {
	
	public String simpleSymbols(String str) {
		
		int i = 1;
		
		//We test, if the first or the last char of the string is a letter than automatically
		//returns false
		if (Character.isLetter(str.charAt(0)))
			return "false";
		if (Character.isLetter(str.charAt(str.length() - 1)))
			return "false";
		
		//We go throw the str, if we found a letter and one of the precedent or following char is not
		//'+' than returns false
		while (i != str.length()) {
			if (Character.isLetter(str.charAt(i)) && 
			    (str.charAt(i - 1) != '+' || 
			    str.charAt(i + 1) != '+'))
				
				return "false";
				
			i++;				
		}
		
		//We run over all the str, and we did not found any mistakes than we return true.
		return "true";
	}

}
