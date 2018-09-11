import java.util.*;
import java.text.DecimalFormat;

public class Test {

	
	
	
	public static void main(String[] args) {
		
		//declaring variables
		DecimalFormat df = new DecimalFormat("##.##"); //will allow the receipt to round to the closest cent
		
		
		String order; 
		int menuNumber; 
		int numberofCups; 
		int response;
		CoffeeShop[][] customers = new CoffeeShop[500][10]; //maximum number of customers, followed by maximum number of different items you can purchase in one order
		Scanner input = new Scanner(System.in); 
		
		
		
	
		
		
	//main loop	
	for (int i = 0; i < customers.length; i++)
	{
	 
		
		for(int j = 0; j < customers[i].length; j++) 
		{
		
		//checks to see which menu number you order and passes a string onto the constructor based on number
		System.out.println("Enter the number of the menu item. \n1.) Espresso 2.) Latte 3.) Coffee      (Any other number will exit the program.)");
			menuNumber = input.nextInt();
			
			if (menuNumber == 1) 
			{
				order = "espresso";
			}
			
			else if (menuNumber == 2) 
			{
				order = "latte";
			}
			
			else if (menuNumber == 3)
			{
				order = "coffee"; 
			}
			else 
			{
				order = "none";
				System.out.println("Goodbye!");
				System.exit(0);
			    
			    
			}
			
			System.out.println("How many?");
			
            numberofCups = input.nextInt(); //how many cups?
            
            //creates new CoffeeShop object based on user input
            customers[i][j] = new CoffeeShop(numberofCups, order);
            
            System.out.println("Anything else? (Enter 1 for yes. Enter any other number for no.)"); //asks if you want to order any other drink
            
            
            response = input.nextInt();
            
            //will go through the loop until the customer stops ordering or reaches the maximum amount they can order
            if (response == 1) {
            	continue;
            }
            
            //skips to outer loop if they say they are done ordering
            else {
            	break;
            }
            
            
			}
		
		
		int counter = 0;
		double total = 0;
		
		System.out.println("~RECIEPT~ \n");
		
		//goes through every order and calculates bill, then prints it
	while(customers[i][counter] != null) 
	{
	
		total = total + customers[i][counter].calcBill();
		System.out.println(customers[i][counter].getNumberOfDrinks() + " " + customers[i][counter].getDrinkName() + " $" + df.format(customers[i][counter].calcBill()));
		counter++;
		
	}
	
	System.out.println("\n TOTAL: $" + df.format(total) + "\n \n -------------Next Customer!---------------- \n");
	
		 
		 
	
		 
	
	}
			
	
		
		

		
		
		
		
		
		
		

	}

}



