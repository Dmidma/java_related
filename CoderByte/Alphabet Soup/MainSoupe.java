import java.util.Scanner;


public class MainSoupe {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		AlphabetSoup c = new AlphabetSoup();
		
		System.out.println(c.alphabetSoup(s.nextLine()));
		
		s.close();
	}

}
