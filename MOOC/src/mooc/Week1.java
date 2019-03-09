package mooc;
import java.util.Scanner;

public class Week1 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int number= Integer.parseInt(scanner.nextLine());
	int number2 = Integer.parseInt(scanner.nextLine());
	
	
	while(number<=number2) {
		
		System.out.println(number);
		number++;
	}
	
	}
}
