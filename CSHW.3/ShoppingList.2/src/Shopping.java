public class Shopping 
{
	public static void main  (String [] args)
	{

		Priority priority = new Priority(); 
		Price price = new Price();
		shoppingBag bag = new shoppingBag(); 
		
		
		priority.setProducts(); // product is an abstract class
		
		priority.setPriority();
	
		price.setPrice();
		
		bag.shoppingCart();

		
	}			
}