import java.util.ArrayList;


public class Division {
	
	public int division(int num1, int num2) {
		
		//We first start by determining all the divider of num1 and num2
		ArrayList<Integer> divNum1 = new ArrayList<Integer>();
		ArrayList<Integer> divNum2 = new ArrayList<Integer>();
		
		for (int i = 1; i < num1; i++)
			if (num1 % i == 0)
				divNum1.add(i);
		
		for (int i = 1; i < num2; i++)
			if (num2 % i == 0)
				divNum2.add(i);
		
		//Next, we find which numbers are repeated in the both arrays
		//We then, add them in comDivArray
		//We go through the shorter array
		ArrayList<Integer> comDivArray = new ArrayList<Integer>();

		for (int i = 0; i < divNum1.size(); i++)
			for (int j = 0; j < divNum2.size(); j++)
				if (divNum1.get(i) == divNum2.get(j))
					comDivArray.add(divNum1.get(i));

		//We return the last integer in the comDivArray
		return comDivArray.get(comDivArray.size() - 1);
	}
}
