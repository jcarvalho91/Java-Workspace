/**
 * input via a question in the console, the report owner's first name
 * as a string and build the last name via input, one character at a time.
 * 
 * 1.a Check, conditionally, to make sure that first name and last name don't 
 * contain any numeric characters number between 0-9. If it does remove it. 
 * The name can not contain any white spaces either or special characters. 
 * 
 * Note to Self: Use REGEX to achieve requirements 1.a 
 * 
 */

/**
 * @author julianacarvalho
 *
 */
import java.util.Scanner;
import java.util.regex.*;



public class Principal {

	public static void main (String [] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Enter First Name:");
		String first_name = keyboard.nextLine(); // next() Accepts only the first string as the first name
		String first_name_two = first_name.replaceAll("[^a-zA-z]", ""); // matches characters from the beginning of string 
		System.out.println("Hello " + first_name_two);
		


	
	} 
	
}







/* REQ.1.2
 * Ask the user to input Last Name. One character at a time.
 * -> Check that name contains NO space, special characters and number. 
		--> If does, remove it. Here you can use REGEX
 */



/*REQ.2
 * Input report name via a request from the console.
 */


/*
 * Input, and display, the total of the numeric input after each input is entered.  
 * 	Average the numeric input, indicate lowest numeric input value and the highest 
 * numeric input value for the previous numeric inputs, before the next numeric input is asked for. 
 * (Example given in class)
 */

