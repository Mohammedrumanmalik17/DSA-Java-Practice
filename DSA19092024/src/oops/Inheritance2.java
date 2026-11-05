package oops;

class Vehicle{
	public void startEngine() {
		System.out.println("Engine starting....");
		
	}
}
class Car extends Vehicle{
	public void speed() {
		System.out.println("I  can drive at 250Kmph");
	}
}
class Bike extends Vehicle{
	public void raceType() {
		System.out.println("I can be used in motorracing..");
	}
	public void stopEngine() {
		System.out.println("Engine stopping..");
	}
}

public class Inheritance2 {
	//hierarchical
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.startEngine();
		c1.speed();
		
		
		
		Bike b1=new Bike();
		b1.startEngine();
		b1.raceType();
		b1.stopEngine();
		
	}

}
