package ApiProject.DATA;

public class SecHig {
	
	public static void main(String[] args) {
		
	int	a[]= {15, 18, 2, 13, 6, 12};
	
	int temp=0;
	
	for(int i=0;i<a.length;i++) {
	
		for(int j=i+1; j<a.length;j++) {
			
			if(a[i]>a[j]) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
		
	}
		int n= a.length-2;
		int c= a[n];
		System.out.println(c);
		
	
		
	}

}
