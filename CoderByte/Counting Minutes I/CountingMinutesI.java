
public class CountingMinutesI {
	
	public String countingMinutesI(String str) {
		
		/*
		 * First, I will divide the str to 6 parts.
		 * 
		 * For example:
		 * 12:30pm-12:00am
		 * Wil be divided to:
		 * __________________
		 * |12|30|pm|12|00|am|
		 * -------------------
		 */
		String [] array = new String[6];
		
		array[0] = str.substring(0, str.indexOf(':'));
		str = str.substring(str.indexOf(':') + 1, str.length());
		array[1] = str.substring(0, str.indexOf('m') - 1);
		str = str.substring(str.indexOf('m') - 1, str.length());
		array[2] = str.substring(0, 2);
		str = str.substring(str.indexOf('m') + 2, str.length());
		array[3] = str.substring(0, str.indexOf(':'));
		str = str.substring(str.indexOf(':') + 1, str.length());
		array[4] = str.substring(0, str.indexOf('m') - 1);
		str = str.substring(str.indexOf('m') - 1, str.length());
		array[5] = str.substring(0, 2);
		
		
		
		/*
		 * We convert from the 12 Hour format to 24 Hour format.
		 * Then, we subtract the secondHour from the firstHour.
		 * If the resultHour is negative we add 24 Hours then we multiply it by 60
		 * 1 Hour = 60 mins.
		 * If it's positive we multiply without adding.
		 * If it's equal to 0 we then test by the minutes.
		 * If the resultMins is negative we add 24 hours to the resultHour, 
		 * we multiply it by 60 and add the resultMins.
		 * If it is positive we then return it as final result.
		 */
		int firstHour = Integer.parseInt(array[0]);
		int firstMins = Integer.parseInt(array[1]);
		int secondHour = Integer.parseInt(array[3]);
		int secondMins = Integer.parseInt(array[4]);
		
		if (firstHour != 12 && array[2].equals("pm"))
			firstHour += 12;
		
		if (firstHour == 12 && array[2].equals("am"))
			firstHour +=12;
		
		if (secondHour != 12 && array[5].equals("pm"))
			secondHour += 12;
		
		if (secondHour == 12 && array[5].equals("am"))
			secondHour +=12;
		
		int resultHour = secondHour - firstHour;
		int resultMins = secondMins - firstMins;
		
		
		if (resultHour > 0)
			return String.valueOf((resultHour * 60) + resultMins);
		else if (resultHour < 0)
			return String.valueOf(((resultHour + 24) * 60) + resultMins);
		else {
			if (resultMins > 0)
				return String.valueOf(resultMins);
			else
				return String.valueOf(((resultHour + 24) * 60) + resultMins);
		}
		
	}

}
