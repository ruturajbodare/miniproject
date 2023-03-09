package Oops;
//parent class
class Animal
{
	//feild
	String name;
	//method of a parent class
	public void eat()
	{
		System.out.println("i am eating!");
	}
	public void sleep()
	{
		System.out.println("i am sleeping");
	}

}
//child class that inherit fron animal
class Tiger extends Animal
{
	//new method in subclass
	public void display()
	{
		System.out.println("my name is:"+name);
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		//create an object of subclass
		Tiger t=new Tiger();
		//
		t.name="tiger";
		t.display();
		//
		//
		t.sleep();
		t.eat();
		

	}

}
