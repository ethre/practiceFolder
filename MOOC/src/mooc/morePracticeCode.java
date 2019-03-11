package mooc;

import java.util.Scanner;

public class morePracticeCode {


	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int number = Integer.parseInt(scanner.nextLine());
	int randomNumber=0;	
	
	randomNumber = drawNumber();
	
	guess();
	}
	
	public static int drawNumber() {
		int rGen = (int)(Math.random()*100);
		return rGen;
	}
	
	public static void guess() {
		if(number==randomNumber) {
			System.out.println("thats the right guess");
		}else if(number<randomNumber) {
			System.out.println("the number is less than given");
		}else {
			System.out.println("the number is more than given");
		}
	}
	
	
}
