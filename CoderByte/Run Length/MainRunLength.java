import java.util.Scanner;


public class MainRunLength {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		RunLength c = new RunLength();
		
		System.out.println(c.runLength(s.nextLine()));
		
		s.close();
	}
}
