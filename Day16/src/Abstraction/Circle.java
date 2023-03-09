package Abstraction;

public class Circle extends shape{


	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		int r=4;
		double area=r*r;
		System.out.println(r);
	}

	@Override
	public void getperimeter() {
		// TODO Auto-generated method stub
		int r=4;
		
		
		double pi=3.14;
		double perimeter=2*pi*r;
		System.out.println(perimeter);
		
	}

}
