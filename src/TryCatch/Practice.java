package TryCatch;

public class Practice {

	int a = 1;
	int b = 0 , c;
	
	
	
	void test() {
		try {
		c = a/b;
		System.out.println("this is infinity ");
		
	}
		catch (ArithmeticException et){
			System.out.println("This is arithmeyic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of range");
		}
		catch(Exception e){
			System.out.println("This is error ");
		}
		finally {
			System.out.println("Finally it is executed" );
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Practice obj = new Practice();
		obj.test();
		
	}

}
