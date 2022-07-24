package Interface;

interface classOne{
	void session() ;
	
}


public class TryInterface implements interfaceClass, classOne{

	public static void main(String[] args) {
		
		TryInterface obj = new TryInterface ();
		obj.drama();
		obj.acting();
		obj.session();
		
		
		//This is called as run time polymorphism when the object is of another class and refrence is of another class.
		interfaceClass object = new TryInterface();
		object.acting();
		
		

	}

	
	public void drama() {
		System.out.println("good drama");
		
	}

	
	public void acting() {
		System.out.println("good acting");
		
	}


	
	public void session() {
		System.out.println("good session");
		
	}
	
	void ownMethod() {
		System.out.println("This is try interface class method");
	}

}
