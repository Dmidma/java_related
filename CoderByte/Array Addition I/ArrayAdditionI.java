import java.util.ArrayList;


public class ArrayAdditionI {
	
	
	/**
	 * Swapping two elements in 
	 * @param array 
	 * with indexes
	 * @param fIndex
	 * @param lIndex
	 */
	private void swap(int [] array, int fIndex, int lIndex) {
			
		int tmp = array[fIndex];
		array[fIndex] = array[lIndex];
		array[lIndex] = tmp;
	}
		
	
	/**
	 * Sorting the 
	 * @param array
	 * The following indexes are essential for the recursive call of the method 
	 * @param beginIndex
	 * @param lastIndex
	 */
	private void quickSort(int [] array, int beginIndex, int lastIndex) {
			
		if (array == null || array.length == 0)
			return;
			
		if (beginIndex >= lastIndex)
			return;
			
		//Selecting the pivot
		int pivot = array[(beginIndex + (lastIndex - beginIndex) / 2)];
			
		//Swapping left side < pivot
		//		  right side > pivot
		int i = beginIndex, j = lastIndex;
			
		while (i <= j) {
			while (array[i] < pivot)
				i++;
				
			while (array[j] > pivot)
				j--;
				
			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
				
		}
			
		//recursively sort two sub parts
		if (beginIndex < j)
			quickSort(array, beginIndex, j);
			 
		if (lastIndex > i)
			quickSort(array, i, lastIndex);
	}
	
	
	public String arrayAddition(int [] arr) {
		
		/*
		 * We start by sorting the array, making sure that the last element in the array will be 
		 * the biggest
		 */ 
		quickSort(arr, 0, arr.length - 1);
		
		/*
		 * If the array have any negative values we then take two sub-arrays
		 * One for negative values and one for positive
		 * so we can add from the negative values after adding from the positive side.
		 * If the biggest element of the array is negative, then we don't do any modifications
		 * because all the other elements will be also negative
		 * 
		 */
		ArrayList<Integer> posSub = null;
		ArrayList<Integer> negSub = null;
		if (arr[arr.length - 1] > 0 && arr[0] < 0) {
			posSub = new ArrayList<Integer>();
			negSub = new ArrayList<Integer>();
			for (int index : arr) {
				if (index < 0)
					negSub.add(index);
				if (index >= 0)
					posSub.add(index);
			}
		}
		
		
		
		if (negSub == null) {
			/*
			 * we take the biggest element and compare it to the sum of other elements
			 * If we find the right combination we return "true" else we return "false"
			 */
			int bigElem = arr[arr.length - 1];
			int i = (arr.length - 2);
		
			int comb, j;
			while (i >= 0) {
				comb = 0;
				if (bigElem > arr[i]) {
					j = i;
					while (j >= 0) {
						if ((comb + arr[j]) <= bigElem)
							comb += arr[j];
						if (comb == bigElem)
							return "true";
						j--;
					}
				}
				
				i--;
			}
		} else {
				
			int bigElem = posSub.get(posSub.size() - 1);
			int i = (posSub.size() - 2);
		
			int comb, j;
			while (i >= 0) {
				comb = 0;
				if (bigElem > arr[i]) {
					j = i;
					while (j >= 0) {
						if ((comb + posSub.get(j)) <= bigElem) {
							comb += posSub.get(j);
							if (comb == bigElem)
								return "true";
						} else if ((comb + posSub.get(j)) > bigElem) {
							comb += posSub.get(j); //Must get subtracted if we don' find the right combination 
							int l = 0;
							while (l < negSub.size()) {
								if ((comb + negSub.get(l)) >= bigElem)
									comb+= negSub.get(l);
								if (comb == bigElem)
									return "true";
								l++;
							}
							comb -= posSub.get(j);
						}
						j--;
					}
				}
				
				i--;
			}
			
		}
		
		return "false";
	}
}
