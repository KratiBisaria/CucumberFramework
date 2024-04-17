package ApiProject.DATA;

public class RepeatingChar {

	public static void main(String[] args) {
		
		String input= "automation";
		char c = 0, d=0;
		for(int i=input.length()-1;i>0;i--) {
			
			for(int j=i-1;j>0;j--) {
			c= input.charAt(i);
			d= input.charAt(j);
			if(c==d) {
				System.out.println(c);	
				
			}	
			
			}
			
			
		}
		
	}
	
}
