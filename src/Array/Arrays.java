package Array;

public class Arrays {
	
	
	int b[] = {1,2,3,4,5,6};
	int c[][] = new int[2][3];
	
	
	int i , k , sum ;
	
	 void sum () {
		for (i=0 ; i< b.length ; i++) {
			sum += b[i];
		}
		System.out.println(sum);
	}
	 
	 void multidimensional () {
		 c[0][0] = 1;
		 c[0][1] = 2; 
		 c[0][2] = 3;
		 c[1][0] = 2;
		 c[1][1] = 5;
		 c[1][2] = 7;
		 
		 
		 for (k = 0 ; k < 2; k++) {
			 for(int j=0 ; j< 3;j++ ) {
				 System.out.println(c[k][j]); 
			 }
			
			
		 }
		 
		 
	 }
	
	
	
	

	public static void main(String[] args) {
		
		Arrays obj = new Arrays();
		obj.sum();
		obj.multidimensional();
		
	
		int i;
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		
		
		for(i=0; i< a.length; i++){
			System.out.println(a[i]);
		}
	}

}
