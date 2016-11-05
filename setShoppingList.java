import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.DoubleStream; 


public class setShoppingList 
{
	private double sum; 
	private double Max;
	private double Min; 

    // Arrays 
	public static String [] product = new String [7]; //Array that will store list of products 
	public static String [] priority = new String [7]; // Array that will store product priorities
	public static double[] productPrice = new double[7]; // Array that will store product prices
	
	// Objects 
	private NumberFormat formatter = new DecimalFormat("#.00");  //formatter that will prices, with two decimal formats. 
	private static Scanner keyboard = new Scanner(System.in); 

	public void getProducts()
    {
	    for ( int count = 0; count < 7; count++) //for every count less than seven, add an item to the "product" array
	        {
                System.out.print("Enter an Item:  ");
				product[count] = keyboard.nextLine(); 
				
				for ( int count2 = 1; count2 < count; count2++)
                    {
					    if(product[count2].equalsIgnoreCase(product[count])); //accepts item added to the product list regardless its uppercase or lowercase.
					}														
			}
	}	


	public static void setPriority()
    {
        for (int count = 0; count< 7; count++)  //for every count less than seven...
			{
			    System.out.println("Enter a priority for:   "+product[count]);
				priority[count] = keyboard.nextLine(); 	// add an item to the "setPriority" array
			}
	
				Arrays.sort(priority); // sort "priority" array by ascending order
	}			
		
		                                              
	public void setPrice()
    {
		
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

	
	/* Class below will display all the products available product, and it's price. And sort it by priority
	 */
	public void getShoppingList()
    {	
				System.out.println(); 
				System.out.println("\n"+"---------------------------------------");
				System.out.print("Priority    " + "   Product"  + "\t\tPrice");
				System.out.println("\n"+"---------------------------------------");
		
        for (int count = 0; count<7; count++)
            {
			    System.out.println(); 
			    System.out.print(priority[count]+"\t\t"); 										// loop through "priority" array and print output values in the report
			    System.out.print(product[count]+"\t\t");  										// loop through "product" array and print output values in the report
			    System.out.print("$ "+Double.valueOf(formatter.format(productPrice[count])));	// loop through "price" array and print output with two decimal places
			}
				System.out.println(); 
				System.out.println("---------------------------------------");
	}	
}

	


	


		