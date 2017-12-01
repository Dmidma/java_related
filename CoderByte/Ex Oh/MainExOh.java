import java.util.Scanner;


public class MainExOh {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		ExOh c = new ExOh();
		
		System.out.println(c.exOh(s.nextLine()));
		
		s.close();
	}
}
