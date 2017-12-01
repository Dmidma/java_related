import java.util.Scanner;


public class MainPrimeTime {
	
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		PrimeTime c = new PrimeTime();
		
		System.out.println(c.primeTime(s.nextInt()));
		
		s.close();
	}
}
