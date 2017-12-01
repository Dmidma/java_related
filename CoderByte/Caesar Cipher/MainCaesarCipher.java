import java.util.Scanner;


public class MainCaesarCipher {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		//CaesarCipher c = new CaesarCipher();
		
		//System.out.println(c.caesarCipher(s.nextLine(), 4));
		
		System.out.println((char)(Integer.parseInt("0" + (int)('z')) + ((5 % 26)) % 65));
		System.out.println((char)Integer.parseInt("065"));
		s.close();
	}
}
