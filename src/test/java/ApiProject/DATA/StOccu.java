package ApiProject.DATA;

import java.util.HashMap;

public class StOccu {
	
	public static void main(String[] args) {
		
		
	    String s="aaaabbbccd" ;
	    String res= "";
	    int count=1;
	    for(int i=0;i<s.length()-1;i++) {
	    	
	    		if(s.charAt(i)==s.charAt(i+1)) {
	    			count++;
	    			continue;
	    		}
	    		else {
	    		res=res+s.charAt(i)+count;
	    		count=1;
	    	}
	    		
	    }
	    res=res+s.charAt(s.length()-1)+count;
    	System.out.print(res);

	}

}
