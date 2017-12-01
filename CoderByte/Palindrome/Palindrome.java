
public class Palindrome {
	
	public String palindrome(String str) {
		
		String tmp = "";
		String reverTmp = "";
		
		
		//we start by copying only the alphabet letters to a tmp string
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
					tmp += str.charAt(i);
		}
		
		//Then, we copy the tmp into reverTmp starting from the end
		for (int i = (tmp.length() - 1); i >= 0; i--) {
			reverTmp += tmp.charAt(i);
		}
		
		//We run through the reverTmp comparing it to the tmp
		//Any thing worng we return "false" else "true"
		for (int i = 0; i < reverTmp.length(); i++) {
			if (reverTmp.charAt(i) != tmp.charAt(i))
				return "false";
		}
		
		return "true";
		
	}
}
