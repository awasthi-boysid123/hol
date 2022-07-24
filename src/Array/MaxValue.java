package Array;

public class MaxValue {
	
	int arr[][] = {{1,2,3},{5,3,8},{6,9,2}};
	int max = arr[0][0];
	int min = arr[0][0];
	int i,j;
	
	void maxValue() {
		for(i=0;i<arr.length ; i++) {
			for(j=0 ; j< 3; j++) {
				if (arr[i][j]>max) {
					max = arr[i][j];
				}else if(arr[i][j] <min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Max Value is " + max);
		System.out.println("Max Value is " + min);
	}
	

	public static void main(String[] args) {

		MaxValue obj = new MaxValue();
		obj.maxValue();
	}

}
