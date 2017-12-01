
public class VowelCount {
	
	public int vowelCount(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.toLowerCase(str.charAt(i)) == 'o' ||
				Character.toLowerCase(str.charAt(i)) == 'i' ||
				Character.toLowerCase(str.charAt(i)) == 'e' ||
				Character.toLowerCase(str.charAt(i)) == 'a' ||
				Character.toLowerCase(str.charAt(i)) == 'u')
				count++;
				
		}
		
		return count;
	}
}
