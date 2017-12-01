
public class FirstFactorial {
	
	public int FirstFactorialer(int num) {
		
		//Since it's multi we initialize the fact at 1.
		int fact = 1;
		
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		
		return fact;
	}
}
