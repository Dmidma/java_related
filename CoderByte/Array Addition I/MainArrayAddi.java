import java.util.Scanner;


public class MainArrayAddi {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayAdditionI c = new ArrayAdditionI();
		
		System.out.println(c.arrayAddition(new int[] {57, 13, 26, 16, 0, 20, -14, -2}));
		
		s.close();
		
		
		
		
	}
}
