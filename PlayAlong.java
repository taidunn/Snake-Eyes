//This version is a play along version. You will roll a die twice (or two dies) then type in the number you recieve.
import java.util.Scanner;

public class PlayAlong {
	
	static Scanner userInput = new Scanner(System.in);

	private static int number1;
	private static int number2;
	//private static int number3 = number1 + number2;
	private static int h = 0;
	
	public static void number1()
	{
		System.out.print("Roll your first number on a die, and type in what the result was: ");
		number1 = userInput.nextInt();
		number2();
	}
	
	public static void number2()
	{
		System.out.print("Roll your second number on a die, and type in what the result was: ");
		number2 = userInput.nextInt();
		System.out.println("");
		promptForInput();
	}
	public static void promptForInput()
	{
		
		System.out.println("Will " + number1 + " " + number2 + " leave you with snake eyes?");

		
		while (number1 != number2)
		{
			System.out.println("No snake eyes here... Trying again...");
			System.out.println("");
			number1();
		}
		if (number1 != 1) {
			System.out.println("No snake eyes here... Trying again...");
			System.out.println("");
			number1();
			
		}	
	}
	
	public static void main(String[] args) 
	{
		number1();
		System.out.println("You've got snake eyes!!!  Number(1) is " + number1 + " and Number(2) is " + number2 + ". This took " + h + " amount of attempts");
	}
}
