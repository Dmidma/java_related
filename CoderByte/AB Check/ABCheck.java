
public class ABCheck {
	
	public String abCheck(String str) {
		
		int i = 0;
		while(i != (str.length() - 1)) {
			//We start by testing if the (index + 4) is lower or equal the the length of the string
			if ((i + 4) <= (str.length() - 1)) {
				
				//if we find an 'a' we test if the (index + 4) is an 'b'
				if (Character.toLowerCase(str.charAt(i)) == 'a' && 
				Character.toLowerCase(str.charAt(i + 4)) == 'b') {
					
					return "true";
				//if we find an 'b' we test if the (index + 4) is an 'a'
				} else if (Character.toLowerCase(str.charAt(i)) == 'b' && 
						 Character.toLowerCase(str.charAt(i + 4)) == 'a') {
				
					return "true";
				}
			}
			
			i++;
		}
		
		return "false";
	}

}
