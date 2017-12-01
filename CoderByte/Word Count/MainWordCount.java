import java.util.Scanner;


public class MainWordCount {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		WordCount c = new WordCount();
		
		System.out.println(c.wordCount(s.nextLine()));
		
		s.close();
	}
}
