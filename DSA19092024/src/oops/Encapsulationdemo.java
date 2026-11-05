package oops;

class Student {
	//data hiding
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
}

public class Encapsulationdemo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Ruman");
		s1.setAge(22);
		
		System.out.println("Student Name: " + s1.getName());
		System.out.println("Student Age: " + s1.getAge());
		
	}

}
