
public class BinaryConverter {
	
	public int binaryConverter(String str) {
		
		//We start from the end of the string 
		//Every time we add to the result Math.pow(2, indexOf2)-and every time we increment indexOf2, starting from 0-
		//Multiplied by the char of the str
		int indexOf2 = 0, result = 0;
		for (int i = (str.length() - 1); i >= 0; i--) {
			result += Integer.parseInt("0" + str.charAt(i)) * Math.pow(2, indexOf2);
			indexOf2++;
		}
		
		return result;
	}
}
