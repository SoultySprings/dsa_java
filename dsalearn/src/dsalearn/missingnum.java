package dsalearn;

public class missingnum {
	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
	
	public int misnum(int[] arr) {
		int n = arr.length+1;
		int sum = (n*(n+1))/2;
		for(int i = 0; i<n-1; i++) {
			sum = sum - arr[i];
		}
		int missnum = sum;
		return missnum;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,5};
		missingnum obj = new missingnum();
		obj.prArr(arr1);
		System.out.println(obj.misnum(arr1));
	}
}
