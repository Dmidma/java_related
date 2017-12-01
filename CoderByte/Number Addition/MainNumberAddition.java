import java.util.Scanner;


public class MainNumberAddition {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		NumberAddition c = new NumberAddition();
		
		System.out.println(c.numberAddition(s.nextLine()));
		
		s.close();
	}
}
