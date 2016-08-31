import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		//ask for number of sides use scanner to get # of sides to roll a die 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Casino.");      //This is a simple print greeting 
		System.out.println("How many sides should each die have?");		 //
		int dice = scanner.nextInt();
		//int dieOutCome = rollADie(dice);
		rollADie(dice, scanner);
		
		
			//	Math.abs(math.pwer(3,5);
	}
	public static void rollADie(int numberOfSides, Scanner scanner ){
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
		double roll1  = Math.random()* numberOfSides;
		
		int die1 = (int)roll1 + 1;
		double roll2  = Math.random()* numberOfSides;
		

		}
	}   int die2 = (int)roll2 + 1;
		System.out.println(die1);
		System.out.println(die2);
		System.out.println("would you like to continue?");
		choice = scanner.next();
        }System.out.println("So you crapped out?");return;

}

