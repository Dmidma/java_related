import java.util.Scanner;


public class MainLetterCount {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		LetterCountI c = new LetterCountI();
		
		System.out.println(c.letterCountI(s.nextLine()));
		
		s.close();
	}

}
