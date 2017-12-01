import java.util.ArrayList;


public class PrimeMover {

	public int primeMover(int num) {
		
		
		//We start by creating an Array of all prime numbers from 1 to 10⁴
		ArrayList<Integer> primeArray = new ArrayList<Integer>();
		boolean notPrime;
		int sqrtNum;
		for (int i = 2; i <= 10000; i++) {
			notPrime = true;
			sqrtNum = (int)Math.round(Math.sqrt(i));
			for (int j = 2; j <= sqrtNum; j++)
				if (i % j == 0)
					notPrime = false;
			
			if (notPrime)
				primeArray.add(i);
		}
		
		//We then return the ith number in the Array
		//Since the index of the array start from 0, we then subtract 1 from the num
		return primeArray.get(num - 1);
	}
}
