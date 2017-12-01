import java.util.Scanner;


public class MainLetter {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		LetterChanges c = new LetterChanges();
		System.out.print(c.letterChanges(s.nextLine()));
		 
		s.close();
		
	}

}
