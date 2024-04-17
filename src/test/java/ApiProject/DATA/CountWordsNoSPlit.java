package ApiProject.DATA;

public class CountWordsNoSPlit {
	
	public static void main(String[] args) {
		
		String str= "This is happy name";
		//String res=" ";
		char[] ch= str.toCharArray();
		 int count= 0;
		for(int i=0; i<str.length();i++) {
			//char c=str.charAt(i);
			if(ch[i]==' ') {
				count++;			
		}
			
		}
		System.out.println(count+1);
	}

}
