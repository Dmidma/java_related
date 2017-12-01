import java.util.Scanner;

public class MainTime {
	
	public static void main(String [] args) {
		
		 Scanner  s = new Scanner(System.in);
		 
		 TimeConvert c = new TimeConvert();
		 
		 System.out.print(c.timeConvert(s.nextInt()));
		 
		 s.close();
	}

}
