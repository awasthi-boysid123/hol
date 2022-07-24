package Inheritance;

public class ChildClassTwo extends InheritFromClasses {
	
	void city() {
		System.out.println("I live in Delhi");
	}
	
	void country() {
		System.out.println("Name of my country is India");
	}
	
	void ut() {
		System.out.println("UT is Delhi");
	}

	public static void main(String[] args) {
		
		ChildClassTwo objForInheritClasses = new ChildClassTwo ();
		objForInheritClasses.hobbies();
		
	}

}
