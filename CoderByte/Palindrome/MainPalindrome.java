import java.util.Scanner;


public class MainPalindrome {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		Palindrome c = new Palindrome();
		
		System.out.println(c.palindrome(s.nextLine()));
		
		s.close();
	}

}
