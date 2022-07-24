package Basics;

public class SumOfArray {
	int[] array = {1,2,3,4,5};
	String[] strArray = {"apple", "orange" , "banana" , "mango" , "strawberry"};
	
	int i,sum,checkIndex , strIndex;
	
	void sumOfArray() {
		
		
		
		for (i=0 ; i< array.length ; i++) {
			sum += array[i];
			if (array[i] == 5 ) {
				System.out.println("Index is "+i);
			}
			
			
		}
		System.out.println(sum);
	}
	
	void loop() {
		
	    for (int i=0; i<4; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        { 
	    	int f=1;
	    	
        for (int j=1; j<=4; j++ ) //inner loop for number of columns
        { 
        	System.out.print(" ");
        	 if(j>=4-i) {
        		 
         		System.out.print(f);
         		System.out.print("");
         		f++;
        	}
       
        } 

        System.out.println(); //ending line after each row
    } 
        System.out.println("*********"); //ending line after each row

        
        for(int a=1;a<=4;a++) {
        	for(int b=3;b>=a;b--) {
        		System.out.print(" ");
        	}
        	for(int c=1;c<=a;c++) {
        		System.out.print(c);
        	}
        	System.out.println("");
        }
        
        
        System.out.println("@@@@@@@@@@@@@");
        
        int n=1;
        int x=2;
        for(int d=1;d<10;d++) {
        	
        	
        	if(n<6) {
        		for(int e=5;e>=d;e--) {
            		System.out.print("*");
            	}	
        	}
        	else {
        		for(int e=1;e<=x;e++) {
            		System.out.print("*");
            		
            	}
        		x++;
        		
        	}
        	
        	System.out.println();
        	n++;
        }
        System.out.println("&&&&&&&&&&&&&&&");
        int r=0;
        for(int q=1;q<=5;q++) {
        	for(int y=1;y<=q;y++) {
        		System.out.print("  ");
        	}
        	for(int w=q;w<10-r;w++) {
        		System.out.print("* ");
        	}
        	System.out.println("");
        	r++;
        }
        
}
		
		
		

		
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SumOfArray sumArray = new SumOfArray();
		sumArray.sumOfArray();
		sumArray.loop();
		
	}

}
