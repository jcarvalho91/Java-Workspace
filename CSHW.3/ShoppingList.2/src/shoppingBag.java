import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class shoppingBag extends Price 
{
		private NumberFormat formatter = new DecimalFormat("#0.00"); 		//formatter that will prices, with two decimal formats. 
		public static ArrayList<String> bag = new ArrayList<String>(); 		//shopping bag ArrayList. This will be used to store all items purchased by the user 
		public static ArrayList<Double> price = new ArrayList<Double>(); 	// price Array. This will store product prices, to provide user with a sum and determine how many more product
																			//...the user can add to shopping bag.
		private double sum = 0; 
	
		public void shoppingCart()
        {
			Scanner input = new Scanner(System.in); 

		
				//** OBJECTS **
			
				//Main Object
					Equals p = new Equals(); 
				
				//Objects to Compare
					Equals p1 = new Equals(); 
					Equals p2 = new Equals();  
					Equals p3 = new Equals();  
					Equals p4 = new Equals(); 
					Equals p5 = new Equals();  
					Equals p6 = new Equals();  
					Equals p7 = new Equals(); 
	
				
				//Available Priorities that user can choose from, when adding product to shopping bag
					p1.bagPriority = "1";  
					p2.bagPriority = "2";  
					p3.bagPriority = "3";
					p4.bagPriority = "4";  
					p5.bagPriority = "5";  
					p6.bagPriority = "6";
					p7.bagPriority = "7";


		/*The while loop below will run until the user has a shopping bag valued at $59.00 or less.  
		 * Acceptable priorities are between 1 - 7. Any priority input outside that will not be accepted. 
		 * Once a priority, has been chosen, the product matching the priority will be added to the shopping bag. 
		 */
					
					
		while (sum <= 59.00){ // 59.00 is max amount that user can add to shopping bag
			
			System.out.println("\nEnter a priority");
			p.bagPriority = input.nextLine(); // Main Object-> user determines which priority to add to shopping bag
		
			if (p1.equals(p)) // equals method tries to match the user defined priority with available priorities. This class the Priority class
			    {
				
				    sum += Price.productPrice[0]; //Take product price from productPrice array to calculate the sum
				    bag.add(Price.product[0]); // Add the first item for the product array and add to the bag ArrayList
				
				    price.add(Double.valueOf(formatter.format(sum))); // Take a copy of the product price and add to "Price" list --> This will be used to build a report in the getShoppingReport class
	
				    System.out.println("\n   Shopping Cart Items: "+bag); //print item added to shopping bag
				    System.out.println("\n   Shopping Bag Total: $ "+Double.valueOf(formatter.format(sum))); // print value of item added to shopping bag
			    }
			else if (p2.equals(p))
			    {
				    sum += Price.productPrice[1]; 
                    bag.add(Price.product[1]); 
                    System.out.println("\n   Shopping Bag Items: "+bag);
                    System.out.println("\n   Shopping Bag Total: $ "+Double.valueOf(formatter.format(sum)));
			    }
			else if (p3.equals(p))
			    {
                    sum += Price.productPrice[2]; 
                    bag.add(Price.product[2]); 
                    System.out.println("\n   Shopping Bag Items: "+bag);
                    System.out.println("\n   Shopping Bag Total: $ "+Double.valueOf(formatter.format(sum)));
			    }
			else if (p4.equals(p))
                {
                    sum += Price.productPrice[3]; 
                    bag.add(Price.product[3]); 	
                    System.out.println("\n   Shopping Bag Items: "+bag);
                    System.out.println("\n   Shopping Bag Total: $ "+Double.valueOf(formatter.format(sum)));
                }
			else if (p5.equals(p))
                {
                    sum += Price.productPrice[4]; 
                    bag.add(Price.product[4]); 
                    System.out.println("\n   Shopping Bag Items: "+bag);
                    System.out.println("\n   Shopping Bag Total: $ "+Double.valueOf(formatter.format(sum)));
                }
			else if (p6.equals(p))
                {
                    sum += Price.productPrice[5]; 
                    bag.add(Price.product[5]); 
                    System.out.println("\n   Shopping Bag Items: "+bag);
                    System.out.println("\n   Shopping Bag Total: $ "+Double.valueOf(formatter.format(sum)));
                }
			else if (p7.equals(p))
                {
                    sum += Price.productPrice[6]; 
                    bag.add(Price.product[6]); 
                    System.out.println("\n   Shopping Bag Items: "+bag);
                    System.out.println("\n   Shopping Bag Total: $ "+Double.valueOf(formatter.format(sum)));
                }
			else
                {
                    System.out.println("Cannot Locate Priority in the Array, Please Try Again");
                }	
		}
		    input.close();
	}
}
		



