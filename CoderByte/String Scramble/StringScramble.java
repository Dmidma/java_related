
public class StringScramble {
	
	public boolean stringScramble(String str1, String str2) {
		
		//We go through the str2 character by character
		//If we find the character in str1 we remove it
		//and pass on to the next character
		//else, we return false
		StringBuilder str1Tmp = new StringBuilder(str1);

		boolean noMatch;
		int j;
		for (int i = 0; i < str2.length(); i++) {
			noMatch = false;
			j = 0;
			while(j < str1Tmp.length()) {
				if (str2.charAt(i) == str1Tmp.charAt(j)) {
					str1Tmp.deleteCharAt(j);
					noMatch = true;
					break;
				}
				else
					j++;
			}
			if (!noMatch)
				return false;
		}
		
		
		return true;
	}
}
