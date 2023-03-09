package Abstraction;

public abstract class Shape1 {
	String color;
	boolean filled;
	public Shape1()
	{
		
	}
	
	public Shape1(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + ", isFilled()=" + isFilled() + "]";
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled()
	{
		if(filled)
		{
			return true;
		}
		else 
			{
			return false;
			}
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();


}
