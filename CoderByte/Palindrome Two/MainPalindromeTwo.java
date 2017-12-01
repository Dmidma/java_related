import java.util.Scanner;


public class MainPalindromeTwo {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		PalindromeTwo c = new PalindromeTwo();
		
		System.out.println(c.palindromeTwo(s.nextLine()));
		
		s.close();
	}
}
