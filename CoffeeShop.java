// Paul Bernabe
// CIS 286
// LAB 1
// 8/28/2018


public class CoffeeShop {
	//instance variables for drink
	private String drinkName = "none";
	private int numberOfDrinks = 0;
	
	
	//constants for tax rates, and prices of different drinks
	public final double TAX_RATE = .09;
	public final double COFFEE_COST = 2.35;
	public final double LATTE_COST = 3.15;
	public final double ESPRESSO_COST = 3.45;
	
	
	//constructor for drinks
	public CoffeeShop (int numbDrinks, String nameofDrink) 
	{
		numberOfDrinks = numbDrinks;
		drinkName = nameofDrink;
	}
	
	
	
	//getter and setter methods
	public String getDrinkName() 
	{
		return drinkName;
	}
	public void setDrinkName(String drinkName) 
	{
		this.drinkName = drinkName;
	}
	public int getNumberOfDrinks() 
	{
		return numberOfDrinks;
	}
	public void setNumberOfDrinks(int numberOfDrinks) 
	{
		this.numberOfDrinks = numberOfDrinks;
	}

	
	
	//cash register method
	public double calcBill () 
	{
		double cost;
	
		
		//checks user input for order, adjusts cost based on drink
		if (drinkName.contains("latte")) 
		{
			cost = LATTE_COST;
		}
		
		else if (drinkName.contains("espresso"))
		{
			cost = ESPRESSO_COST;
		}
		
		else 
		{
			cost = COFFEE_COST; //default is coffee
		}
	
		//calculates the total cost
		double subtotal = numberOfDrinks * cost;
		double salestax = subtotal * TAX_RATE;
		double fullprice = subtotal + salestax;
		return fullprice;
		
	}
	

	

}
