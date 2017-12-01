import java.util.Scanner;


public class MainReverse {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		FirstReverse c = new FirstReverse();
		System.out.println(c.FirstReverser(s.nextLine()));
		s.close();
	}
}
