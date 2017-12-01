import java.util.Scanner;


public class MainNums {
	
	public static void main(String [] args) {
		
		Scanner  s = new Scanner(System.in);
		
	    CheckNums c = new CheckNums();
	    
	    int num1 = s.nextInt();
	    s.nextLine();
	    int num2 = s.nextInt();
	    System.out.print(c.checkNums(num1, num2));
	    
	    s.close();
		
	}
}
