package dsalearn;
//Resizing array when the array is out of space
public class resarray {

	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println(arr.length);
	}
	
	public int[] resarr(int[] arr) {
		int n = arr.length*2;
		int[] tmp = new int[n];
		for (int i = 0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;
		return arr;
	}
	public static void main(String[] args) {
		int[] arr1 = {23,21,32,4,35,3,45};
		resarray obj = new resarray();
		obj.prArr(arr1);
		obj.resarr(arr1);
		obj.prArr(arr1);
	}
}
