package Inheritance;

class istLevel {
	int p = 1000 , t = 4;
	double r = 2.5 , si;
	void simpleInterest(){
		si = (p*r*t)/100;
		System.out.println(si);
	}
}

class secondLevel extends istLevel {
	int l = 20, ar ;
	
	void area () {
		ar = l*l;
		System.out.println(ar);
	}
}


public class MultilevelInheritance extends secondLevel {

	double sm ;
	void sum() {
		sm = si + ar;
		System.out.println("sum is "+ sm);
	}
	
	public static void main(String[] args) {

		MultilevelInheritance obj = new MultilevelInheritance() ;
		obj.simpleInterest();
		obj.area();
		obj.sum();
		}
		
	}


