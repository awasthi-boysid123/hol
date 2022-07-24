package Final;




class finalPractice{
	
	final void finalTesting() {
		System.out.println("This is final keyword");
	}
	
	
}


public class PracticeFinal extends finalPractice{
	 // Final keyword is used when you do not want to change value of any variable means you want it constant and whose value 
	//you cannot override
	// Access modifier = public private protected
	
   // Even if you will change the access modifier of a class from public to final then you cannot inherit that class.
	
	int a = 10;
	//but if you have made a variable final you cannot override it.
	//eg
	final int b = 30;
	
	
	
	//You cannot use even function name if it has been declared with final already
	// void finalTesting() {
	//	System.out.println("This is final keyword");
	//}
	
	void testing() {

		super.finalTesting();
		a = 20;
		//b = 20; It will give error here.
		System.out.println("this is " +a);
	}
	

	public static void main(String[] args) {
		
		final int data = 10;
		//data++; 
		//it will give error as it cannot be changed.
		// TODO Auto-generated method stub
		PracticeFinal obj = new PracticeFinal();
		obj.testing();

	}

}
