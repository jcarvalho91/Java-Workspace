import java.util.*; 

public class Priority extends Product{
	
static Scanner keyboard = new Scanner(System.in); 
	
	public void setPriority()
    
	{
        for (int count = 0; count< 7; count++)  //for every count less than seven...
			{
			    System.out.println("Enter a priority for:   "+product[count]);
				priority[count] = keyboard.nextLine(); 	// add an item to the "setPriority" array
			}
	
				Arrays.sort(priority); // sort "priority" array by ascending order
	}	
	
	public void getPriority(){
		
	}
}

