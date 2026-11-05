package oops;

class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("Im writing");
	}
	
	
	public void print() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
	//constructor
	Pen(String color,String type){
		this.color=color;
		this.type=type;
	}
}

public class ClassesandObjects {
	public static void main(String[] args) {
		
		Pen p1 = new Pen("Blue","Gel");
	
		p1.write();
		p1.print();
		
		Pen p2 = new Pen("Red","Ball");
		
		p2.write();
		p2.print();
		
	}

}
