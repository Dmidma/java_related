import java.util.ArrayList;


public class DashInsert {
	
	public String dashInsert(String str) {
		
		
		/*
		 * We start by separating all the numbers after converting them to integer
		 * into an array.
		 */
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		for (int i = 0; i < str.length(); i++)
			intArray.add(Integer.parseInt("0" + str.charAt(i)));
		
		
		
		/*
		 * We run through the intArray, if we find two odd number next to each others,
		 * we then add the dash into the result String.
		 */
		String result = String.valueOf(intArray.get(0));
		
		for (int i = 1; i < intArray.size(); i++) {
			if ((intArray.get(i - 1) % 2) != 0 && (intArray.get(i) % 2) != 0)
				result = result + "-";
			
			result = result + String.valueOf(intArray.get(i));
			
		}
		return result;
	}

}
