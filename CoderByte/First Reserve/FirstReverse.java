
public class FirstReverse {
	
	//Reverse the String given in arguments
	public String FirstReverser(String str) {
		
		String tmp = "";
		
		for (int i = (str.length() - 1); i >= 0; i--) {
			tmp += str.charAt(i);
		}
		
		return tmp;
	}
}
