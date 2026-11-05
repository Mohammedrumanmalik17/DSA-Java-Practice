package acc;

public class CharacterOccurence {
	
	public static int charcount(String S ,int N,int C) {
		
	    if(!S.equals(S.toLowerCase())) {
	    	return -1;
	    }
	    int count =0;
		for(char ele:S.toCharArray()) {
			if(Character.isLowerCase(ele)) {
				if(ele==C) {
					count++;
					
				}
				
			}

		}
	    
		return count;
		
	}
	
	public static void main(String[] args) {
		
//		String S="helloworld";
//		int N =10;
//		char C ='l'

//		String S="HELLOWORLD";
//		int N =10;
//		char C ='L';
		
		String S="mercermettl";
		int N =11;
		char C ='t';
		
		int result=charcount(S,N,C);
		if(result!=-1) {
		
			System.out.println(result);
		}
	}

}
