
public class WordCount {
	
	public int wordCount(String str) {
		
		int count = 0;
		
		//Since the words are separated by one space
		//we count the spaces to find the nbr of words
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == ' ')
				count++;
		}
		
		//We test if the string starts with a space then we subtract 1
		if (str.charAt(0) == ' ')
			count--;
		
		//We test if the string ends with a space then we substract 1
		if (str.charAt(str.length() - 1) == ' ')
			count--;
		
		//If the count is negative in the case of no words but space
		//else we add 1 and return the number of words 
		if (count < 0)
			return 0;
		else {
			count++;
			return count;
		}
		
	}
}
