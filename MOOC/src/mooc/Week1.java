package mooc;
import java.util.Scanner;

public class Week1 {

	public static void main(String[] args) {
	/*
	Scanner scanner = new Scanner(System.in);
	
	int number= Integer.parseInt(scanner.nextLine());
	*/
		
	/*
	while(number<=number2) {
		System.out.println(number);
		number++;
	}
	*/
	
	/*
	int i = 0;
	int sum = 0;
	while(i<number) {
		sum+=number;
	i++;
	}
	System.out.println("sum is "+ sum);
	*/
	
	/*
	int i=0;
	int factorialSum =0;
	while(i<=number) {
		if(i==0) {
		factorialSum=1;
		i++;
	}else{
		factorialSum*=i;
		i++;
	}
	}
	System.out.println(factorialSum);
	*/
	/*
	int i=0;
	while(i<=number) { 
	
	greet();
	i++;
	}
	
	}
	public static void greet() {
		System.out.println("whats up amigo");
	}
	*/
	
	printTriangle(5);
	
	}
	
	
	public static void printStars(int amount) {
		int i=0;
		while(i<amount) {
			System.out.print("*");
			i++;
		}
	}

	public static void printSquare(int sideSize) {
		int i=0;
		while(i<sideSize) {
			System.out.println(" ");
			printStars(sideSize);
			i++;
		}
	}	
		
	public static void printRectangle(int width, int height) {
		int i=0;
		while(i<height) {
			
			printStars(width);
			System.out.println(" ");
			i++;
			
		}
	}
	
	public static void printTriangle(int size) {
		for(int i=0; i<size;i++) {
			printStars(i);
			System.out.println(" ");
		}
	}
}
