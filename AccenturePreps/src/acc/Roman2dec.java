package acc;

import java.util.HashMap;

public class Roman2dec {
	public static int romantodecimal(String romanLiteral) {
		
		HashMap<Character,Integer>romanvalues=new HashMap<>();
		
		romanvalues.put('I',1);
		romanvalues.put('V',5);
		romanvalues.put('X',10);
		romanvalues.put('L',50);
		romanvalues.put('C',100);
		romanvalues.put('D',500);
		romanvalues.put('M',1000);
		
		
		int prevvalue=0;
		int decimalvalue=0;
		
		for(int i= romanLiteral.length()-1;i>=0;i--) {
			char currchar = romanLiteral.charAt(i);
			int currValue =romanvalues.get(currchar);
			
			
			if(currValue<prevvalue) {
				decimalvalue-=currValue;
			}
			else {
				decimalvalue+=currValue;
			}
			prevvalue=currValue;
		}
		return decimalvalue;
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String romanLiteral="MCMXCIV";
		
		System.out.println(romantodecimal(romanLiteral));
	}

}
