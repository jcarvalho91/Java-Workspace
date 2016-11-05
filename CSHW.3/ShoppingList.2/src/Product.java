import java.util.*;


public abstract class Product
{
    // Arrays 
	public static String[] product = new String [7]; //Array that will store list of products 
	public static String [] priority = new String [7]; // Array that will store product priorities
	public static double [] productPrice = new double[7]; // Array that will store product prices

	// Objects 
	private static Scanner keyboard = new Scanner(System.in); 

	public void setProducts()
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
}