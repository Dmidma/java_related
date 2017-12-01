import java.util.Scanner;


public class MainAdditivePersistence {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		AdditivePersistence c = new AdditivePersistence();
		
		System.out.println(c.additivePersistence(s.nextInt()));
		
		s.close();
	}
}
