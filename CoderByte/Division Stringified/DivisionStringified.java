
public class DivisionStringified {
	
	public String divisionStringified(int num1, int num2) {
		
		/*
		 * We start by dividing the two numbers.
		 * Then, we test if the first digit (the closest one to the ,) is bigger or equal to 5.
		 * If it is the case we add one to the div.
		 */
		int div = num1 / num2;
		float coma = (float)num1 / (float)num2;
		
		
		char closDig = String.valueOf(coma).charAt(String.valueOf(coma).indexOf('.') + 1);
		String tmp = "";
		tmp += closDig;
		
		if (Integer.parseInt(tmp) >= 5 && String.valueOf(div).length() < 3)
			div++;
		
		
		return (String.format("%,d", div));
	}

}
