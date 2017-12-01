import java.util.ArrayList;


public class SecondGreatLow {
	
	public String secondGreatLow(int [] arr) {
		
		
		/*
		 * We start by finding the biggest and the lowest elements in the array
		 */
		int biggestElem = arr[0];
		int lowestElem = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > biggestElem)
				biggestElem = arr[i];
			if (arr[i] < lowestElem)
				lowestElem = arr[i];
		}
		
		/*
		 * We make a tmpArray that contains all the other elements except the biggest 
		 * and lowest elements.
		 */
		ArrayList<Integer> tmpArray = new ArrayList<Integer>();
		for (int index : arr)
			if (index != biggestElem && index != lowestElem)
				tmpArray.add(index);
		
		/*
		 * We run through the tmp array finding the second biggest and lowest
		 * elements.
		 */
		int secondBigElem = lowestElem;
		int secondLowElem = biggestElem;
		for (int i = 0; i < tmpArray.size(); i++) {
			if (secondBigElem < tmpArray.get(i))
				secondBigElem = tmpArray.get(i);
			if (secondLowElem > tmpArray.get(i))
				secondLowElem = tmpArray.get(i);
		}
		
		
		return (secondLowElem + " " + secondBigElem);
	}
}
