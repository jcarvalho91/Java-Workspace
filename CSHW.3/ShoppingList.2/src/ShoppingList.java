import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ShoppingList extends Priority {
	private NumberFormat formatter = new DecimalFormat("#.00");  //formatter that will prices, with two decimal formats. 

	
	public void setShoppingList() {

	
	
	}  
	
	public void getShoppingList() {
	
	
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
	
	
	
	
	
	
}




















	

/*
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

	
*/

	
	public class getShoppingReport 
	{

		shoppingBag report = new shoppingBag(); 
		
		public void getReport()
		{	
					System.out.println();
					System.out.print("\n\nSHOPPING BAG");
					//System.out.println(); 
					System.out.println("\n"+"-----------------------------");
					System.out.print("Product    " + "   Price");
					System.out.println("\n"+"-----------------------------");
			
	        for (String r: shoppingBag.bag)
	            {
	        		System.out.println(r);
				    	for (double p : shoppingBag.price)
				    		{
				    			System.out.print("                "+"$ "+p+"\n");
				    		}	    
				}
					System.out.println(); 
					System.out.println("-----------------------------");
					System.out.println("\n      TOTAL = $ "+ shoppingBag.price); 
		}	
	}


		

}
