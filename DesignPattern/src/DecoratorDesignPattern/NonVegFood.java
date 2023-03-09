package DecoratorDesignPattern;

public class NonVegFood  extends FoodDecorator
 {
	public NonVegFood(food newFood) 
	{
		super(newFood);
		
	}
	
	
	
	public String prepareFood()
	{
		return super.prepareFood() +" With Roasted Chiken and Chiken Curry  "; 
		
	}
	
	
	public double foodPrice()
	{
		return super.foodPrice()+150.0;
		
	}



}
