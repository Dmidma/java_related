import java.util.Scanner;


public class MainPrimeMover {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		PrimeMover c = new PrimeMover();
		
		System.out.println(c.primeMover(s.nextInt()));
		
		s.close();
	}
}
