import java.util.ArrayList;


public class NumberAddition {

	public String numberAddition(String str) {
		
		//We create an array that contains all the numbers in the string.
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		//I have added a space to the last of the string so I can add the last number if ever it exists
		str += " ";
		
		//We go through the str finding all the number and putting them in the array after converting them
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				j++;
			}
			else {
				if (j != 0)
					intArray.add(Integer.parseInt(str.substring(i - j, i)));
				j = 0;
			}
				
		
				
		}
		
		//We add all the numbers in the array if it's not empty
		int sum = 0;
		if (!intArray.isEmpty())
			for (int i = 0; i < intArray.size(); i++)
				sum += intArray.get(i);
		
		return String.valueOf(sum);
		
	}
}
