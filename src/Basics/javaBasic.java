package Basics;

public class javaBasic {
	
	int a = 10 , b = 20 , sum;
	String name = "madam", stringAfterReverse = "";
	int i;
	void sumOfNumber() {
		sum = a + b;
		System.out.println(sum);
	}
	
	void stringInterpolation () {
		for(i = name.length()-1 ; i >=0 ; i--)
		{
			stringAfterReverse += name.charAt(i);
			}
		System.out.println(stringAfterReverse);
		
		if (stringAfterReverse == name) {
			System.out.println("CorrectOutput");
		}else {
			System.out.println("NotCorrect");
		}
		
		}
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaBasic interpolation = new javaBasic();
		interpolation.stringInterpolation();
		
		javaBasic add = new javaBasic();
		add.sumOfNumber();

		//How to use reusable files
		ResuableFiles file = new ResuableFiles();
		file.checkHeader();
		
		String str = "You got $100";
		int index = str.indexOf("$");
		System.out.println(index);
		char charAtIndex = str.charAt(8);
		System.out.println(charAtIndex);
		System.out.println(str.substring(index));
		
		
	}

}
