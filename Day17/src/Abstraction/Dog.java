package Abstraction;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("dog eat more food");
		
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep more time");
		
	}

}
