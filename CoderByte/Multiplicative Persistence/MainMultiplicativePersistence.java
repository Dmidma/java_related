import java.util.Scanner;


public class MainMultiplicativePersistence {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		MultiplicativePersistence c = new MultiplicativePersistence();
		
		System.out.println(c.multiplicativePersistence(s.nextInt()));
		
		s.close();
	}

}
