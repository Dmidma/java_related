
public class AlphabetSoup {
	
	//private class that contains an int and a char
	//and its getter and setters 
	private class struct {
		
		private int asciiCode;
		private char lowerUpper;
		
		//getter & setter of asciiCode
		public int getAsciiCode() {
			return this.asciiCode;
		}
		public void setAsciiCode(int asciiCode) {
			this.asciiCode = asciiCode;
		}
		
		//getter & setter of lowerUpper
		public int getLowerUpper() {
			return this.lowerUpper;
		}
		public void setLowerUpper(char lowerUpper) {
			this.lowerUpper = lowerUpper;
		}
	}
	
	//A method that swap two elements in the struct array
	private void swap(struct [] array, int fIndex, int lIndex) {
		
		struct tmp = array[fIndex];
		array[fIndex] = array[lIndex];
		array[lIndex] = tmp;
	}
	
	//Quick sort method on a struct array
	private void quickSort(struct [] array, int beginIndex, int lastIndex) {
		
		if (array == null || array.length == 0)
			return;
		
		if (beginIndex >= lastIndex)
			return;
		
		//Selecting the pivot
		int pivot = array[(beginIndex + (lastIndex - beginIndex) / 2)].getAsciiCode();
		
		//Swaping left side < pivot
		//		  right side > pivot
		int i = beginIndex, j = lastIndex;
		
		while (i <= j) {
			while (array[i].getAsciiCode() < pivot)
				i++;
			
			while (array[j].getAsciiCode() > pivot)
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
	
	
	//alphabetSoup will call every derclared method in this class and retrun the sorted String
	public String alphabetSoup(String str) {
		
		
		//Creating an array that contains the ASCII code of a letter and a char that indicates
		//if it is lower or upper case.
		struct [] tab = new struct[str.length()];
		for (int i = 0; i < str.length(); i++) {
			
			tab[i] = new struct();
			tab[i].setAsciiCode((int)str.charAt(i));
			
			if (tab[i].getAsciiCode() >= 65 && tab[i].getAsciiCode() <= 90) {
				tab[i].setLowerUpper('u');
				tab[i].setAsciiCode(tab[i].getAsciiCode() - 65);
			} else {
				tab[i].setLowerUpper('l');
				tab[i].setAsciiCode(tab[i].getAsciiCode() - 97);
			}	
		}
		
		//sorting the struct array
		quickSort(tab, 0, tab.length - 1);
		
		String sortedStr = "";
		//converting the ascii codes to char, considering the lower and upper cases
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getLowerUpper() == 'u')
				sortedStr += (char) (tab[i].getAsciiCode() + 65);
			else
				sortedStr += (char) (tab[i].getAsciiCode() + 97);	
		}
		
		
		return sortedStr;
	}

}
