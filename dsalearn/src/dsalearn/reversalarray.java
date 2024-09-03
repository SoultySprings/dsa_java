package dsalearn;
// Reversal of a given array, ex. i/p = {2,4,7,9} then o/p = {9,7,4,2}
public class reversalarray {
	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void revarr(){
		int[] arr1 = {23,4,52,67,7,8,89};
		int n = arr1.length;
		int  m = n-1;
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++) {
			arr2[m] = arr1[i];
			m--;
		}
		prArr(arr1);
		System.out.println("");
		prArr(arr2);
	}
	/*Another way to solve the above problem would be to use pointers as follows
	 * public void revarr(int nums[], int st, int end){
	 * 	int temp = 0
	 * 	while (st<end){
	 * 		temp = nums[st];
	 * 		nums[st] = nums[end];
	 * 		nums[end] = temp;
	 * 		st++;
	 * 		end--;
	 * 	}
	 * }*/
	public static void main(String[] args) {
		reversalarray obj = new reversalarray();
		obj.revarr();
	}
}
