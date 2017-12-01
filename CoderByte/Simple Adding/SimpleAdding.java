
public class SimpleAdding {
	
	public int simpleAdding(int num) {
		
		
		//If the number is not from 1 to 1000 it will exist with 0
		if (num < 1 || num > 1000)
			return 0;
		
		int tmp = 0;
		
		for (int i = 1; i <= num; i++)
			tmp += i;
		
		return tmp;
	}
}
