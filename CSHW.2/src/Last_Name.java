import java.util.Scanner;
import java.util.regex.*;

public class Last_Name {

	public static void main(String[] args) {
	
		/* REQ.1.2
		 * Ask the user to input Last Name. One character at a time.
		 * --> Check that name contains NO space, special characters and number. 
		   --> If does, remove it. Here you can use REGEX
		 */
		
		Scanner Keyboard = new Scanner (System.in);
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Enter Last Name:"); 
		
		char last_name = reader.next().charAt(0); //http://stackoverflow.com/questions/13942701/take-a-char-input-from-the-scanner
		
		
		
		
		 //switch to use the character
		// append to list 
		// print list
		
		
		System.out.println(last_name);	
		
		// design a switch statement to known when stop for last name

	}

}
