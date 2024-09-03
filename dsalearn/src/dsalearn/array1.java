package dsalearn;
//Initialization and Declaration of arrays
public class array1 {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void arr() {
		int[] arr1 = new int[5];
		arr1[0] = 2;
		arr1[1] = 3;
		arr1[2] = 4;
		arr1[3] = 6;
		arr1[4] = 8;
		//another way is int[] arr1 = {2,3,3,6,8};
		printArray(arr1);
	}
	public static void main(String args[]) {
		array1 obj1 = new array1();
		obj1.arr();
	}
}
