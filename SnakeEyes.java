public class SnakeEyes {

	private static int number1 = (int)(Math.random()*7);
	private static int number2 = (int)(Math.random()*7);
	private static int number3 = number1 + number2;
	private static int h = 0;
	
	public static void promptForInput()
	{
		h++;
		number1 = (int)(Math.random()*7);
		number2 = (int)(Math.random()*7);
		number3 = number1 + number2;
		
		System.out.println("Will " + number1 + " " + number2 + " leave you with snake eyes?");

		
		while (number1 != number2)
		{
			System.out.println("No snake eyes here... Trying again...");
			promptForInput();
		}
		if (number1 != 1) {
			System.out.println("No snake eyes here... Trying again...");
			promptForInput();
			
		}
		
		
	}
	public static void main(String[] args) 
	{
		promptForInput();
		System.out.println("You've got snake eyes!!!  Number(1) is " + number1 + " and Number(2) is " + number2 + ". This took " + h + " amount of attempts");
	}
}
