package SetInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InterHash {
	
	HashMap<String,Object> test = new HashMap<String,Object> ();
	
	void testCase() {
		
		test.put("id", 1);
		test.put("name", "Sid");
		test.put("Job", "Multitasking");
		test.put("KnowledgeSkill", "TopClass");
		test.put("Ranking",1);
		
		
		for (Object value :test.keySet()) {
			System.out.println("Check : "+test.get(value));
		}
		
		
		
		Set<Entry<String, Object>> convert = test.entrySet();
		Iterator<Entry<String, Object>> it = convert.iterator();
		
		while(it.hasNext()) {
          
			//System.out.println(it.next());
			//Map.Entry me = (Map.Entry)it.next();
			Map.Entry<String, Object> h = (Map.Entry<String, Object>)it.next();
			System.out.println(h.getKey());
			System.out.println(h.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterHash ob = new InterHash();

		ob.testCase();
	}

}
