
public class LongestWord {
	
	public String longestWord(String sen) {
		
		
		//I have added a space at the end so I can take the last word if it is the longest word
		sen += " ";
		
		//The first and last index of a word 
		int fIndex;
		int lIndex;
		
		//Current longest word
		String curLongest = "";
		
		int i = 0;
		
		//We start our loop until the index reach the end of the String
		do {
		
			//We start by finding the first index of a word
			while (!Character.isLetter(sen.charAt(i))) {
				i++;
			}
			fIndex = i;
			

			//We find the last index of a word
			while (Character.isLetter(sen.charAt(i))) {
				i++;
			} 
			lIndex = i;
				
		
			if (curLongest.length() < (lIndex - fIndex))
				curLongest = sen.substring(fIndex, lIndex);
			
			
		} while (i != (sen.length() - 1));
		
		
		
		return curLongest;
	}

}
