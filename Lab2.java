import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nIn collaboration with ExperienceIT & Grand Circus...");
		System.out.println("\n\n--A VERY BASIC GAME--\n");
		System.out.println("\nHey. Please enter your name and press [Enter] to begin");
		String UserName = scanner.nextLine();
		
		if (UserName.equalsIgnoreCase("Rip Van Winkle")){
			
			System.out.println("\nHa! look at you.\n");
			System.out.println("\n\n\nP.S. You win I guess.");
			
		}
		
		else{
			
			System.out.println("\nCool. Welcome to the world, " + UserName + ".");
			System.out.println("\n**Instructions: Use the number keys to make your selections.**\n\n...");		
			System.out.println("\nYou wake up beneath a tree.");
			System.out.println("\n\nDo you...\n\n1) Go back to sleep, or\n2) Scratch your face");
			
			int UserChoice = scanner.nextInt();
			
			if (UserChoice == 1){
			
				System.out.println("\nYou're lazy.\n\n\nP.S. You lose and goodbye.");
			
			}
		
			else if (UserChoice == 2){
		
				System.out.println("\nYou scratch your face because it itches.");
				System.out.println("You find a long beard fixed to your face.");
				System.out.println("A bird flies out of it.");
				System.out.println("Never in your life have you been able to grow a beard.\n");
				
				System.out.println("\nDo you...\n");
				System.out.println("1) Look down at your watch, or\n2) Run back to town");
				UserChoice = scanner.nextInt();
			
				if (UserChoice == 1){
				
					System.out.println("\nYour watch is broken and so is your life.\n\nYou lose and goodbye.");
				}
			
				else {
				
					System.out.println("\nYou run back to town.");
					System.out.println("Upon arrival, you come to realize you've been asleep for some 20 years.");
					System.out.println("You are super old now.");
					System.out.println("The villagers ask, 'Who are you?' ... ");
					System.out.println("You can't seem to remember");
					System.out.println("\n\n\nP.S. You lose and goodbye.");
					
				}
				
			}
			
		}	
		
		scanner.close();
		
	}
}
