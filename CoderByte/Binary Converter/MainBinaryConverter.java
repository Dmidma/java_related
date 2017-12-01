import java.util.Scanner;


public class MainBinaryConverter {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		BinaryConverter c = new BinaryConverter();
		
		System.out.println(c.binaryConverter(s.nextLine()));
		
		s.close();
	}
}
