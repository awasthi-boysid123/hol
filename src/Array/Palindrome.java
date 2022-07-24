package Array;

public class Palindrome {
	
	String name = "madam", reverse = "";
	int i;
	
	void rev() {
		for (i = name.length()-1; i>=0 ; i--) {
			//System.out.println(name.charAt(i));
			reverse += name.charAt(i);
			System.out.println(reverse);
		
		}
		System.out.println(reverse);
		if (reverse == name) {
			System.out.println("correct");
		}
		else {
			System.out.println("Not Correct");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome obj = new Palindrome();
		obj.rev();
	}

}
