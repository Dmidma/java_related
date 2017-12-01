import java.util.Scanner;


public class MainCheck {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		ABCheck c = new ABCheck();
		
		System.out.println(c.abCheck(s.nextLine()));
		
		s.close();
	}

}
