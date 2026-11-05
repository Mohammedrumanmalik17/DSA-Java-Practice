package oops;

interface Mother{
     void relationship();
}
interface Father{
	void rishta();
}
class Son implements Mother,Father{
	@override
	public void relationship() {
		System.out.println("IM the Mother");
	}
	public void rishta() {
		System.out.println("IM the Father");
	}
	
}

public class Inheritance3 {
	//multiple inheritance
	public static void main(String[] args) {
		Son s1=new Son();
		s1.relationship();
		s1.rishta();
		
	}
	
}