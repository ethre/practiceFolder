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
	
	printStars(5);
	
	}
	
	public static void printStars(int amount) {
		int i=0;
		while(i<amount) {
			System.out.print("*");
			i++;
		}
	}
	
}