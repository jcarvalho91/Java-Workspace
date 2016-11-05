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
