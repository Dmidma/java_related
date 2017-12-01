
public class AdditivePersistence {
	
	public int additivePersistence(int num) {
		
		
		int repetetion = 0;
		
		String str = String.valueOf(num);
		int tmpSum;
		while (str.length() != 1) {
			tmpSum = 0;
			for (int i = 0; i < str.length(); i++) {
				tmpSum += Integer.parseInt("0" + str.charAt(i));
			}
			repetetion++;
			str = String.valueOf(tmpSum);
		}
		
		return repetetion;
	}
}
