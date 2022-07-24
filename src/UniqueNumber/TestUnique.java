package UniqueNumber;

import java.util.ArrayList;

public class TestUnique {
	
	String pa = "abc";
	String reverse = "";
	
	int arr[] = {1,3,4,5,6,8,7,7,7,8,9,3,4,5};
	int i;
	
	String ar[] = {"Sid","dd"};
	String ba[] ;
	
	ArrayList<Object> a = new ArrayList<Object> ();
	
	void testing() {
		
		for(i=0; i<arr.length;i++) {
			
			if(arr[i]/2 == 0 ) {
			
			}else {
				System.out.println("It is unique number "+ arr[i]);
			}
			
			
		}
		
		
	}
	
	
	void checkUnique () {
		
		for (i= 0 ; i < arr.length ; i++) {
			int k = 0;
			if (!a.contains(arr[i])) {
				a.add(arr[i]);
				k++;
				for (int j= i+1 ; j< arr.length ;j++) {
					
					if (arr[i] == arr[j]) {
						k++;
					}
				}
				//System.out.println(arr[i]);
			    if(k==1) {
				System.out.println(arr[i]+" is unique number"); 
				}
			}
		}
		
	}
	void pal () {
		for(i = 0 ; i< pa.length();i++) {
			reverse += pa.charAt(i);
		}
	}
	
	void palin() {
		
		
		
		for(i = 0 ; i< ar.length ; i++) {
			a.add(0, ar[i]);
			
		}
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestUnique obj = new TestUnique();
		//obj.testing();
		//obj.checkUnique();
		obj.palin();
		obj.pal();
	}

}
