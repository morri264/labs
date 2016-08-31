import java.util.Scanner;

public class Lab3 { // Start the Class

	public static void main(String[] args) {//Start the main method
		// TODO Auto-generated method stub
		//Program to find squares and colors 
		
		Scanner scanner = new Scanner(System.in);
		int lastNumber;
		String choice = "y";
		do{
			System.out.println("Enter an integer");
			lastNumber = scanner.nextInt();
			for(int i = 1 ; i < lastNumber; i++){
			System.out.println("Number" + "\t" + "square"
			+ "\t" + "cube");
			System.out.println("======");
			int square= calculateSquare(i);
			int cube = i * i* i ;
			System.out.println(i +  "\t" + square + "\t"
			+ cube);
			}
			System.out.println("Continue?(y/n):");
			choice=scanner.next();
			System.out.println();
		} // Ends do
		while(choice.equalsIgnoreCase("y")){
					}

	public static void outputLineForNumber(int number) {
		int square = calculateSquare(number);
		int cube = calculateCube(number);
	}

	public static int calculateSquare(int number) {
		return number * number;

	}

	public static int calculateCube(int number){
			return number * number * number;
}
	}
