import java.util.Scanner;
public class LoopPractice2 {
	public static void main(String[] args) { 
		Scanner input= new Scanner(System.in);
		int userNumber=0,sum=0;
		//Using a while loop and if statement to continue adding numbers while checking for negatives and excluding them from sum.
		while (userNumber>=0) {
			System.out.println("Enter a number(Enter a negative to end): ");
			userNumber=input.nextInt();
			
				if (userNumber>0) {
					sum+=userNumber;
				}
			
		}
		System.out.println("The sum is: "+sum);
	}
}
