package acc;

public class NumberOfrotations {
	public static double  findNoRotationstoMove(double x1,double y1,double x2,double y2,double radius) {
		
		double distance =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double circumf= 2*Math.PI*radius;
		
		double rotations =distance/circumf;
		return rotations;
	}
	
	
	public static void main(String[] args) {
		double x1=2;
		double y1=3;
		
		
		
		double x2=5;
		double y2=7;
		
		
		double radius=2;
		
		System.out.println(findNoRotationstoMove(x1,y1,x2,y2,radius));
		
	}

}
