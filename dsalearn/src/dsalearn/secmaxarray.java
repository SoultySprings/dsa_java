package dsalearn;
//find the second max from a given array
public class secmaxarray {

	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void secmaxarr(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				secmax = max;
				max = arr[i];
			} else if (arr[i]>secmax && arr[i]!=max) {
				secmax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1123,2132,2132,314,352,32,345,35,53,455,35,3,45};
		secmaxarray obj = new secmaxarray();
		obj.prArr(arr1);
		System.out.println();
		obj.secmaxarr(arr1);
	}
}
