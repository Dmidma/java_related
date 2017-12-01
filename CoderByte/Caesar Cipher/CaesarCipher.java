


public class CaesarCipher {
	
	public String caesarCipher(String str, int num) {
		
		
		//We go through the str, if it is an alphabetic letter, we then test if it is upper or lower case
		//If it is upper case we subtract from the ASCII Code 65 and 
		//we test the key from mod(26)
		//(ASCII code of 'a' is 97 and 'A' is 65)
		StringBuilder tmpStr = new StringBuilder(str);
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(tmpStr.charAt(i))) {
				if (Character.isLowerCase(tmpStr.charAt(i)))
					tmpStr.setCharAt(i, (char) ((Integer.parseInt("0" + tmpStr.charAt(i) + (num % 26)) % 65) + 65));
				else
					tmpStr.setCharAt(i, (char) ((Integer.parseInt("0" + tmpStr.charAt(i) + (num % 26)) % 97) + 97));
			}
		}
		
		return tmpStr.toString();
	}
}
