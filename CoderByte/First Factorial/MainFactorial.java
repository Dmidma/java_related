import java.util.Scanner;


public class MainFactorial {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		FirstFactorial c = new FirstFactorial();
		
		System.out.println(c.FirstFactorialer(s.nextInt()));
		
		s.close();
		
	}
}
