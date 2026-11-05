//package acc;
//
//public class ChangeContactsCase {
//	public static void casechangeroffirstnlastname(String Fname,String Lname) {
//	
//		
//		StringBuilder modifiedFname = new StringBuilder();
//		StringBuilder modifiedLname = new StringBuilder();
//		
//	for(char f:Fname.toCharArray()) {
//			if(!Character.isLowerCase(f)) {
//				modifiedFname.append(Character.toLowerCase(f));
//			}
//			else {
//				modifiedFname.append(f);
//			}
//		}
//	for(char l:Lname.toCharArray()) {
//		if(!Character.isUpperCase(l)) {
//			modifiedLname.append(Character.toUpperCase(l));
//		}
//		else {
//			modifiedLname.append(l);
//		}
//	}
//	System.out.print(modifiedFname+" ");
//	System.out.print(modifiedLname);
//	}
//	
//
//	
//	
//	public static void main(String[] args) {
////		
////		String F="John";
////		String L="abraham";
//		
//		String F="RUMAN";
//		String L="malik";
//		
//		
//		casechangeroffirstnlastname(F,L);
//	}
//
//}



//chutiye;



package acc;

public class ChangeContactsCase {
	public static void main(String[] args) {

		
		String F="RUMAN";
		String L="malik";
		System.out.println(F.toLowerCase()+ " "+ L.toUpperCase());
		
	}
}


