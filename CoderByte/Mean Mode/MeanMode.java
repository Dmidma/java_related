import java.util.ArrayList;


public class MeanMode {
	
	
	public int meanMode(int [] arr) {
		
		/*
		 * The mean is the usual average 
		 * We start by calculating the mean
		 */
		int mean = 0;
		for (int i = 0; i < arr.length; i++)
			mean += arr[i];
		
		mean = mean / (arr.length);
		
		
		/*
		 * The mode is the number that is repeated more often than any other.
		 * We find the mode of the table, if we don't find any we return 0
		 * We make a tmpArray that contains all the element of the arr without duplication
		 */
		ArrayList<Integer> tmpArray = new ArrayList<Integer>();
		tmpArray.add(arr[0]);
		boolean notDuplicated;
		for (int i = 1; i < arr.length; i++) {
			notDuplicated = false;
			for (int j = 0; j < tmpArray.size(); j++) {
				if (arr[i] == tmpArray.get(j))
					notDuplicated = true;
			}
			if (!notDuplicated)
				tmpArray.add(arr[i]);	 
		}
		
		/*
		 * We go through the tmpArray counting how much each Integer is repeated in the arr
		 * Then we make a finale array that contain the number of repetitions of each element
		 */
		int [] repArray = new int[tmpArray.size()];
		for (int i = 0; i < tmpArray.size(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (tmpArray.get(i) == arr[j])
					repArray[i]++;
			}
		}
		
		/*
		 * We run through the repArray if all the element are repeated only one time
		 * we return 0, else, the mode is the number who is repeated the most
		 */
		int bigRep = repArray[0];
		int indexBigRep = 0;
		for (int i = 1; i < repArray.length; i++) {
			if (bigRep < repArray[i]) {
				bigRep = repArray[i];
				indexBigRep = i;
			}
		}
		if (bigRep == 1)
			return 0;
		else if (mean == tmpArray.get(indexBigRep))
			return 1;
		else 
			return 0;
			
	}

}
