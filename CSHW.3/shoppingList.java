public class shoppingList {

	public static void main (String [] args){
		

		setShoppingList list = new setShoppingList(); //Class that creates Shopping List
		
				list.getProducts();  // class that takes product list
				
				System.out.println(); //add a space
				
				setShoppingList.setPriority(); // Static class that will set product priority
				
				System.out.println(); // add space
				
				list.setPrice(); //class that will set product price 
				
				list.getShoppingList(); // class that will get the report 

		 shoppingBag bag = new shoppingBag(); // Class that adds items to Shopping Bag
		 		
		 		bag.shoppingCart(); 
		 		
		getShoppingReport report = new getShoppingReport(); //Class that display a shopping report
		 
		 		report.getReport();  
		}
	}
	