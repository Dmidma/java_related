import java.util.Scanner;


public class MainVowel {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		VowelCount c = new VowelCount();
		
		System.out.println(c.vowelCount(s.nextLine()));
		
		s.close();
		
	}

}
