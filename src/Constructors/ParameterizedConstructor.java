package Constructors;

public class ParameterizedConstructor extends PracticeSuper {
	
	int a , b, c;
	
	ParameterizedConstructor(int x ){
		super();
		a = x;
		System.out.println("This is first constructor "+a);
		
	}
	
    ParameterizedConstructor(int x , int y){
    	
    	a = x;
    	b = y;
    	System.out.println("This is second constructor " +a +" " +b );
		
	}

     ParameterizedConstructor(int x, int y ,int z){
    	 a = x;
    	 b = y;
    	 c = z;
    	 System.out.println("This is constructor three " +a + " " +b +" " +c);
	
    }
     
     void display() {
    	 System.out.println("This is display " +a + " "+b+ " "+c);
     }

	public static void main(String[] args) {
		
		ParameterizedConstructor obj = new ParameterizedConstructor(10);
		obj.display();
		ParameterizedConstructor objOne = new ParameterizedConstructor(10,20);
		objOne.display();
		ParameterizedConstructor objTwo = new ParameterizedConstructor(10,90,32);
		objTwo.display();
		ConstructTest ob = new ConstructTest();
		ob.functionToCheckSuper(19,30);
	}
}
