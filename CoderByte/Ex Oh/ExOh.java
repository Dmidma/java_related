
public class ExOh {
	
	public String exOh(String str) {
		
		int nbrX = 0, nbrO = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.toLowerCase(str.charAt(i)) == 'x')
				nbrX++;
			if (Character.toLowerCase(str.charAt(i)) == 'o')
				nbrO++;
		}
		
		if (nbrX == nbrO)
			return "true";
		else
			return "false";
	}

}
