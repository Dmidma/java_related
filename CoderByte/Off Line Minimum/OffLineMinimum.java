import java.util.ArrayList;


/**
 * @author dmidma
 *
 */
/**
 * @author dmidma
 *
 */
public class OffLineMinimum {

	public String offLineMinimum(String [] strArr) {


		String returnLow = "";

		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++)
			strList.add(strArr[i]);

		
		//I have added a "0" at the end of the List So I can remove the "E" If there number 
		//is greated than the number of Integers 
		strList.add("0");  
						
		
		//We Go through the list, if we find an "E", we then look for the lowest element before it
		//Remove it from the list and concat it to the resultString.
		//We then remove the "E" from the list And start all over, until the index reach the end of List.
		int i = 0;
		do {
			
			//We test if the Array starts with "E" then we remove it immediatly. 
			while (strList.get(0).equals("E"))
				strList.remove(0);
				
			if (strList.size() == 0)
				break;
			
			if (strList.get(i).equals("E")) {
				returnLow += lowElem(strList, i) + ",";
				i--;
				strList.remove(i);	
				i = 0;
			}
			else
				i++;
			
		} while (i < strList.size());
		
		
		//We remove ',' if the resulting String ends with one.
		if (returnLow.charAt(returnLow.length() - 1) == ',')
			returnLow = returnLow.substring(0, returnLow.length() - 1);

		return returnLow;
	}

	/**
	 * This function returns the Lowest element in a String List.
	 * It convert the integer elements, compare and find the lowest integer
	 * Then convert it back to string and return it, after removing it from the list
	 */
	private String lowElem(ArrayList<String> strList, int indexEnd) {


		int tmpLow = Integer.parseInt(strList.get(0));
		int indexOfLowest = 0;
		for (int i = 0; i < indexEnd; i++)
			if ((Integer.parseInt(strList.get(i))) < tmpLow) {
				tmpLow = Integer.parseInt(strList.get(i));
				indexOfLowest = i;
			}

		strList.remove(indexOfLowest);

		return String.valueOf(tmpLow);

	}
}
