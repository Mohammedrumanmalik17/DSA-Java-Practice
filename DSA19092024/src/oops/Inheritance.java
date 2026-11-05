package oops;


class Animal{
	public void eat() {
		System.out.println("All animal eats");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog barks");
	}
}

class Tommy extends Dog{
	public void fvt() {
		System.out.println("Tommy loves to play with foootball");
	}
}
public class Inheritance {
	public static void main(String[] args) {
//		Dog d1 = new Dog();
//		d1.eat();
//		d1.sound();
		//single inheritance
		Tommy t1=new Tommy();
		t1.eat();
		t1.sound();
		t1.fvt();
		//multilevel inheritance
		
		
	}

}
