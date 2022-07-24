package Constructors;

public class PracticeSuper extends ConstructTest {
	
	
	int a = 10, b;
	
	PracticeSuper(){
		super.consti();
		System.out.println("This is practice super");
	}
	

	
	void dataEnter(int x, int y) {
		super.functionToCheckSuper(90, 100);
		a=x;
		b=y;
		System.out.println("This data enter " +a +" " + b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeSuper obj = new PracticeSuper();
		obj.dataEnter(10, 30);
		
	
	}

}
