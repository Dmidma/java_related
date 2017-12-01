import java.util.Scanner;


public class MainPowersOfTwo {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		PowersOfTwo c  = new PowersOfTwo();
		
		System.out.println(c.powersOfTwo(s.nextInt()));
		
		s.close();
	}
}
