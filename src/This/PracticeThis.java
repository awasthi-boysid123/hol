package This;

public class PracticeThis {
	
	int a;
	int b = 2;
	//This refers to current object. Object scope that lies in class level.
	//This always refers to global variable of the class not the local one.
	
	void swift() {
		int b = 10;
		
		System.out.println("The value of swift " + this.b);
		System.out.println("The value of swift " + b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeThis ob = new  PracticeThis();
 
		ob.swift();
	}

}
