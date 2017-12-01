import java.util.Scanner;


public class MainSwapCase {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		SwapCase c = new SwapCase();
		
		System.out.println(c.swapCase(s.nextLine()));
		
		s.close();
	}
}
