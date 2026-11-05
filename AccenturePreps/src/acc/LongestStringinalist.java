package acc;

public class LongestStringinalist {
	public static void main(String[] args) {
		String name ="I am Mohammed ruman malik";
		String[]substr=name.split(" ");
		String max="";
		for(String ele:substr) {
			String currentMax=ele;
			if(currentMax.length()>max.length()) {
				max=currentMax;
			}
		}
		System.out.println(max);
	}

}
