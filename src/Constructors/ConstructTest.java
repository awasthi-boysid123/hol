package Constructors;


class Construct{
	
	int a,b;
	
	void consti() {
		
		System.out.println("This is consti");
	}
	
	void dataConstruct() {
		System.out.println("This is data construct.");
	}
	
	void functionParentClass(int x , int y) {
		a = x;
		b = y;
		System.out.println("the value of function parent class is " +a+ " " +b);
	}
	
}

public class ConstructTest extends Construct {
	
	void constiChild() {
		super.dataConstruct();
		super.functionParentClass(10, 20);
		System.out.println("This is constiChild");
		
	}
	public void functionToCheckSuper(int x , int y) {
		a = x;
		b = y;
		System.out.println("the value of function parent class is " +a+ " " +b);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructTest obj = new ConstructTest();
        obj.constiChild();
	}


}
