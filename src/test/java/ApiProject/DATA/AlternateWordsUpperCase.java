package ApiProject.DATA;

public class AlternateWordsUpperCase {
	
	public void converteventoUpper(String str) {
		
		int length= str.length();
		char[] ch= str.toCharArray();
		char c = 0;
		for(int i=0; i<length;i++) {
			
			if(i%2==0 && i==0) {
				c= Character.toUpperCase(ch[i+1]);
			}
			else {
				
				c=str.charAt(i);
			}
			System.out.print(c);	
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "uniquevalues";
		//output = uNiQuEvAlUeS
		new AlternateWordsUpperCase().converteventoUpper(str);
		
		
		
	}

}
