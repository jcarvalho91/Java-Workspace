import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Price extends Product{
	
	static Scanner keyboard = new Scanner(System.in); 
	
	@SuppressWarnings("unused")
	private double sum; 
	private double Max;
	private double Min; 
	
	public void setPrice(){
		
		Random ran = new Random(); // user the random method to come with a price that will be assigned to the product

		System.out.println("\nEnter Your Purchase Minimum"); // user will enter the minimum amount that will like to spent
		Min = keyboard.nextDouble(); 
		
		System.out.println("\nEnter Your Maximum Budget"); 		// user will enter the maximum amount that it can spend. This will will be used to determine how to...
		Max = keyboard.nextDouble(); 							//.. come up with random prices to assign to products. 
																//Note: Shopping bag can store only $59.00, but this will help the user determine the range of prices to buy from.
		
		
		
		/* DESCRIPTION
		 * 		Create a random price between $5.50 and $150.00
		 * 		rangeMin + (rangeMax - rangeMin) * ran.nextDouble
		 * 		SOUCE:	http://stackoverflow.com/a/3680648/5977953
		 */
		
		for (int count=0; count < 7; count++)
			{
				productPrice[count] = Min + (Max - Min) * ran.nextDouble();   
			}
				sum = DoubleStream.of(productPrice).sum(); //Uses the "Stream" package to determine the array sum. 
}
	public void getPrice(){
		return; 
	}
}
