
public class SwapCase {
	
	public String swapCase(String str) {
		
		//I use the StringBuilder because it has setCharAt();
		StringBuilder tmp = new StringBuilder(str);
		
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isLetter(str.charAt(i)))
				if (Character.isLowerCase(str.charAt(i)))
					tmp.setCharAt(i, Character.toUpperCase(str.charAt(i)));
				else
					tmp.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
		
		
		return tmp.toString();
	}
}
