import java.util.Scanner;


public class MainAirthGeo {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArithGeo c = new ArithGeo();
		
		System.out.println(c.arithGeo(new int[] {-6, -4, -2, 0, 2, 4, 6}));
		
		s.close();
	}
}
