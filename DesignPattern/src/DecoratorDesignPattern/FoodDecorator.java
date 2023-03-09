package DecoratorDesignPattern;

public abstract class FoodDecorator implements food {
	private food newFood;
	public FoodDecorator(food newFood)
	{
	this.newFood=newFood;	
	}
	@Override
	public String prepareFood()
	{
		return newFood.prepareFood();	
	}
	public double foodPrice()
	{
		return newFood.foodPrice();	
	}
}