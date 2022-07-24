package Array;

public class MinValue {
	
	
	int arr[][] = {{9,2,3},{4,5,8},{1,7,8}};
	int min = arr[0][0];
	int i,j;
	
	void minVal() {
		for (i=0; i< arr.length ; i++) {
			for (j=0; j<3;j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Min value is " + min);
	}
	
	
	
	
	public static void main(String[] args) {

		MinValue obj = new MinValue();
		obj.minVal();

	
	
	}
		
}


