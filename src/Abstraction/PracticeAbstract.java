package Abstraction;


 abstract class abstarctTest {
	
	abstract void data();
	abstract void name();
	
	void good() {
		System.out.println("the article is good");
	}
 }
	
	class check extends abstarctTest  {
		void checking() {
			
		}

		@Override
		void data() {
			System.out.println("Data is good");
			
		}

		@Override
		void name() {
			System.out.println("name is good");
		}
	}



public class PracticeAbstract extends abstarctTest{

	public static void main(String[] args) {
		
		PracticeAbstract obj = new PracticeAbstract();
		obj.data();
		abstarctTest ob = new PracticeAbstract();
		ob.name();
		abstarctTest o = new check();
		o.data();
		

	}

	@Override
	void data() {
		System.out.println("Data is good view");
		
	}

	@Override
	void name() {
		System.out.println("name is good y");
		
	}

}
