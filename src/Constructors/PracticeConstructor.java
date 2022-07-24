package Constructors;

public class PracticeConstructor {

	int a = 10,b , c;
	
	PracticeConstructor(){
		System.out.println("This is constructor");
		
		}
	
	
	
	void display() {
		System.out.println("the value of variable " + a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeConstructor obj = new PracticeConstructor();
         obj.display();
	}

}
