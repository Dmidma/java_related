
public class PrimeTime {
	
	public boolean primeTime(int num) {
		
		//1 is not a prime number
		if (num == 1)
			return false;
		
		//we take the square root of the number.
		int squareNum = (int) Math.round(Math.sqrt(num));
		
		//Next, we divide the num to all prime numbers less than squareNum
		//Since, we don't know which are the prime numbers
		//I am going to divide all number from 1 to the squareNum
		for (int i = 2; i <= squareNum; i++) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}
}
