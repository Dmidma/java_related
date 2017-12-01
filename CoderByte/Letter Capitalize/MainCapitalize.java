import java.util.Scanner;


public class MainCapitalize {
	
	public static void main(String [] args) {
		
		Scanner  s = new Scanner(System.in);
	    
		LetterCapitalize c = new LetterCapitalize();
	    
		System.out.print(c.letterCapitalize(s.nextLine())); 
	    
		s.close();
	}

}
