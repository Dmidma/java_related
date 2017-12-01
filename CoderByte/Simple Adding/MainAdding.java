import java.util.Scanner;


public class MainAdding {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		SimpleAdding c = new SimpleAdding();
		
		System.out.print(c.simpleAdding(s.nextInt()));
		
		s.close();
	}

}
