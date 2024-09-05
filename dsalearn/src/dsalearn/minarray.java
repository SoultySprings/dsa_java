package dsalearn;
//Finding the minimum out of a given array
public class minarray {
	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void minarr(int[] arr) {
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		minarray obj = new minarray();
		int[] arr1 = {1123,2132,32,314,352,32,345,35,53,455,35,3,45};
		obj.prArr(arr1);
		System.out.println();
		obj.minarr(arr1);
	}
}
