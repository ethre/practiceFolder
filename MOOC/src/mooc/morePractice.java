package mooc;

public class morePractice {

	public static int calculateCharacters(String text) {
		System.out.println("The string entered is "+ text);
		int numberOfChar = text.length();
		return numberOfChar;
	}
	public static char returnFirstLetter(String text) {
		System.out.println("The string entered is "+ text);
		char letter = text.charAt(0);
		return letter;
	}
	
	
	public static void main(String[] args) {	
		int number = calculateCharacters("Paul");
		
		char letter = returnFirstLetter("Paul");
		System.out.println(number + letter);
	}
}