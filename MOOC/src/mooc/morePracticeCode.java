package mooc;

import java.util.Scanner;

public class morePracticeCode {


	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int randomNumber=0;	
	
	randomNumber = drawNumber();
	
	for(int i=0; i<3;i++) {
	int number = Integer.parseInt(scanner.nextLine());
	System.out.println(randomNumber);
	if(number==randomNumber) {
		System.out.println("thats the right guess");
	}else if(number<randomNumber) {
		System.out.println("the number is greater than user thought");
	}else {
		System.out.println("the number is lesser than user thought");
		}
	}
	}
	
	public static int drawNumber() {
		int rGen = (int)(Math.random()*100);
		return rGen;
	}
	
}
