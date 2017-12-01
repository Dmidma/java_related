
public class ArithGeo {
	
	public String arithGeo(int [] arr) { 
		
		//If the length of the arr is whether 1 or null we then return "-1"
		if (arr.length == 1 || arr == null)
			return "-1";
		
		//If the length of the arr is 2, then we return automatically "arithmetic"
		//else we start our verification
		if (arr.length == 2)
			return "arithmetic";
		else {
		
			//We suppose an arithmetic and geometric pattern by the first two elements of the arr
			int aritPattern = arr[1] - arr[0];
			int geomePattern = arr[1] / arr[0];
			
			boolean aritTrue = true;
			boolean geomTrue = true;
			
			//we run through the arr and we eliminate the wrong pattern 
			for (int i = 1; i < (arr.length - 1); i++) {
				
				if ((i + 1) <= (arr.length - 1)) {
					if (arr[i] * geomePattern != arr[i + 1])
						geomTrue = false;
					if (arr[i] + aritPattern != arr[i + 1])
						aritTrue = false;
				}	
			}
			
			if (geomTrue)
				return "geometric";
			else if (aritTrue)
				return "Arithmetic";
			else
				return "-1";
		
		}
		
	}
}
