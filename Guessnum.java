import java.util.Scanner;


public class Guessnum {
	public static void main (String[] args){
		
	Scanner keyboard = new Scanner(System.in);
	
	int correct = 10;
	int chance = 0;

	System.out.print("Choose a number between 1 and 10: ");
	int enternum = keyboard.nextInt();
	chance++;

		while(enternum != correct && chance < 5 ){
			if(enternum < 1 || enternum > 10) {
				System.out.print("Please select a number between 1 and 10: ");
				enternum = keyboard.nextInt();
				chance++;
			}

			System.out.println("Nope. Guess again: ");
			enternum = keyboard.nextInt();
			chance++;	
		}
		
		if (enternum == correct)
		System.out.println("You got it in " + chance + " amount of tries.");
		else if (chance == 5)
		System.out.println("Too many tries.");

		
	}

}
