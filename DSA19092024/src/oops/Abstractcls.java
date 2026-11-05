package oops;

abstract class Jaanwar{
	abstract void eat();
	
	//method or body
	public void sleep() {
		System.out.println("Sleeping");
	}
	//constructor
	Jaanwar(){
		System.out.println("Constructor called");
	}
}
class Horse extends Jaanwar{
	public void eat() {
		System.out.println("Im eating");
	}

	
	
}
class Cat extends Jaanwar{
	public void eat() {
		System.out.println("Im eating too");
	}

	
	
}

public class Abstractcls {
	public static void main(String[] args) {
		
		
		
		Horse h1 = new Horse();
		h1.eat();
		
		
		Cat d1=new Cat();
		d1.eat();
		
		
//		Jaanwar J = new Jaanwar();
//		J.eat();
		
		
	}

}
