
public class LetterChanges {
	
	public String letterChanges(String str) {
		
		
		//We Make an array that contains alphabetics from 'z' to 'a' 
		char [] tabAlpha = new char[26];
		tabAlpha[0] = 'z';
		char t = 'a';
		for (int i = 1; i < 26; i++) {
			tabAlpha[i] = t;
			t++;
		}
		
		//StringBuilder allows us to change a char from a specific index with setChartAt(index, char)
		StringBuilder tmp = new StringBuilder(str);
		
		//We go through the String if we find a letter we change its equivalent in the array.
		//We cast the char into int so can subtract the (ASCII Code of the char minus 2). 
		//% 26 because, if we have 'z' we must start from the beginning of the array
		//(ASCII code of 'a' is 97 and 'A' is 65)
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				tmp.setCharAt(i, tabAlpha[(((int)str.charAt(i) - 95) % 26)]);
			}
			
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				tmp.setCharAt(i, Character.toUpperCase(tabAlpha[(((int)str.charAt(i) - 63) % 26)]));
			}
				
		}
		
		
		//We go through the new String and Uppercase any vowel
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == 'a' ||
				tmp.charAt(i) == 'e' ||
				tmp.charAt(i) == 'i' ||
				tmp.charAt(i) == 'o' ||
				tmp.charAt(i) == 'u') {
				tmp.setCharAt(i, Character.toUpperCase(tmp.charAt(i)));
			}
		}
		
		//We cast the StringBuilder toString();
		return tmp.toString();
	}
}
