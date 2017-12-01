
public class ThirdGreatest {

	public String thirdGreatest(String [] strArr) {

		//Since the strArray will at least have three words I won't test if it is empty or not
		//I create an array that will contain the length of each word in the strArr
		int [] lengthArray = new int[strArr.length]; 
		for (int i = 0;i < strArr.length; i++) {
			lengthArray[i] = strArr[i].length();
		}

		//Since we are looking for the third greatest, we repeat the cycle three time.
		int threeTime = 0;
		int indexBiggest = 0;
		while (threeTime < 3) {
			//We find the biggest word by going through the lengthArray
			indexBiggest = indexOfBiggestElem(lengthArray);
			//Then we change it to 0
			lengthArray[indexBiggest] = 0;

			threeTime++;
		}

		return strArr[indexBiggest];
	}

	private int indexOfBiggestElem(int [] array) {
		int indexBiggest = 0;
		int tmpBiggest = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] > tmpBiggest) {
				indexBiggest = i;
				tmpBiggest = array[i];
			}

		return indexBiggest;

	}
}
