import java.util.Scanner;


public class MainLongest {
	
	public static void main(String [] args) {
		
		Scanner  s = new Scanner(System.in);
		LongestWord c = new LongestWord();
		System.out.print(c.longestWord(s.nextLine()));
		
		s.close();
	}
}
