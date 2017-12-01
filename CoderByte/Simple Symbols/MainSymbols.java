import java.util.Scanner;


public class MainSymbols {
	
	public static void main(String [] args) {
		
		Scanner  s = new Scanner(System.in);
	    
		SimpleSymbols c = new SimpleSymbols();
	    
		System.out.print(c.simpleSymbols(s.nextLine()));
		
		s.close();
	}
}
