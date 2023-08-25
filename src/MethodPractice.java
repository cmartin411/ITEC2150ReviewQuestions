import java.util.Scanner;
public class MethodPractice {
	
	public static void main(String[] args) { 
		Scanner input= new Scanner(System.in);
		
		//invoking calculateSquare
		System.out.println("Enter a number to square: ");
		int userInput=input.nextInt();
		
		System.out.println(calculateSquare(userInput));
		
		//invoking printName
		System.out.println("Enter your name: ");
		String userName=input.next();
		
		printName(userName);		
	}
	
	//creating calculateSquare method
	public static int calculateSquare(int userNumber) {
	    int square=(int)(Math.pow(userNumber,2));
	    return square;
	}
	
	//creating printName method
	public static void printName(String name) {
		System.out.println("Hello, "+name+"!");
	}
}
