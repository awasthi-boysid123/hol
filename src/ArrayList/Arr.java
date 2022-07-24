package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arr {

	ArrayList<Object> ob = new ArrayList<Object>();
	
	void test() {
		ob.add(1);
		ob.add("data");
		ob.add(2);
		ob.add("is");
		ob.add("good");
		
		Iterator<Object> name = ob.iterator();
		
		while(name.hasNext()) {
			
			System.out.println(name.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arr object = new Arr();
		object.test();

	}

}
