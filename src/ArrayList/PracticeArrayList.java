package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;





public class PracticeArrayList {
	
	
	void array() {
		 ArrayList<String> obj = new ArrayList<String>();
		 obj.add("Data");
		 obj.add("is");
		 obj.add("sha");
		 obj.add("Daa");
		 obj.add("i");
		 obj.add("shape");
		 obj.add("ata");
		 obj.add("s");
		 obj.add("ape");
		 
		 for (int i =0 ; i < obj.size(); i++) {
			
			 String ab = obj.get(i);
			 if (ab == "shape") {
				 System.out.println("found element");
				 System.out.println(ab);
			 }
		 }
		 System.out.println("not found");
		 

		 String a = obj.get(1);
		 System.out.println(a);
		 
		 
		 
		 System.out.println(obj);
		 
		 
		 
		 
		 
		 
		 
		
		 Iterator<String> ar =obj.iterator();
		 
		 while(ar.hasNext()) {
			 System.out.print("Iterator "+ ar.next() + " ");
			
		 }
	}

	public static void main(String[] args) {

		PracticeArrayList o = new PracticeArrayList();
		o.array();

		 
	}

}
