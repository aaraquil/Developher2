//Importing the scanner class 
import java.util.Scanner;

public class ShowReverse {

	public static void main(String[] args) 
	{
		int myNum =0;
		int myRevNum =0;
		
		//Creating the scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your number:");
		
		//waiting for user input
		myNum = in.nextInt();
		
		while (myNum != 0)
		{
			myRevNum = myRevNum * 10;
			myRevNum = myRevNum + myNum%10;
			myNum = myNum/10;
		}
		
		//Returning the reverse of user input
		System.out.println("The reverse of your number entered is: " + myRevNum);

	}

}