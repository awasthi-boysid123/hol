package SetInterface;

import java.util.HashSet;

public class HasSet {
	
	
	//Any type of element you can enter here.
	HashSet<Object> ob = new HashSet<Object> ();
	void practiceSet() {
		//It is not sequential and does not store duplicate values
		
		HashSet<String> obj = new HashSet<String>();
		obj.add("Data");
		obj.add("is");
		obj.add("is");
		obj.add("added");
		
		System.out.println("This is obj "+ obj);
		
		ob.add("string");
		ob.add(1);
		ob.add(1.34);
		ob.add("class");
		int d = ob.size();
		int e = obj.size();
		
		if (ob.contains(1)) {
			System.out.println("It is good");
		}else {
			System.out.println("It is not good");
		}
		System.out.println("No of elements in an ob array ="+" "+ d);
		System.out.println("No of elements in an obj array ="+" "+ e);
		System.out.println("This is ob "+ ob);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HasSet objec = new HasSet();
		objec.practiceSet();
		

	}

}
