import java.util.Scanner;


public class MainDashInsert {

	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		DashInsert c = new DashInsert();
		
		System.out.println(c.dashInsert(s.nextLine()));
		
		s.close();
	}
	
}
