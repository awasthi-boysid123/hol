package SetInterface;

import java.util.HashMap;

public class HasMap {
	
	HashMap<String,String> obj = new HashMap<String,String> ();
	HashMap<String,Object> o = new HashMap<String,Object> ();
	
	void hMap() {
				
		HashMap<Integer,String> ob = new HashMap<Integer,String>();
		ob.put(0, "Sid");
		ob.put(1, "Sean");
		ob.put(2, "James");
		ob.put(3, "Frank");
		
		obj.put("name", "Sid");
		obj.put("Hobbies", "Many");
		obj.put("Gender", "Male");
		
		o.put("id", 1);
		o.put("name", "Sid");
		o.put("Salary", 4000.56);
		
		for (int i = 0 ; i <= ob.size();i++ ) {
			System.out.println(ob.get(i));
		}
		
		for (String i: o.keySet()) {
			System.out.println("key" + " "+ i + " value" + " " + o.get(i));
		}
		
		System.out.println(ob);
		System.out.println(obj);
		System.out.println(o);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasMap object = new HasMap();
		object.hMap();


	}

}
