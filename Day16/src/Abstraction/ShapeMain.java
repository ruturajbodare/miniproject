package Abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c=new Circle1("red",true,34);
		System.out.println(c);
		Circle c1=new Circle();
		c.setColor("green");
		System.out.println(c.getColor());
        System.out.println(c);
	}

}
