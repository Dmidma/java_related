
public class PowersOfTwo {

	public boolean powersOfTwo(int num) {
		
		if (num == 0)
			return false;
		int div = num;
		while (div != 1) {
			if (div % 2 != 0)
				return false;
			div = div / 2;
		}
		
		return true;
	}
	
}
