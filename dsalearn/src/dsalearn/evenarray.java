package dsalearn;
//Find the number of even integers from a given array and print them
public class evenarray {
	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void evarr() {
		int[] arr2 = {2,3,4,5,6,7,8,9,12};
		int evcnt = 0;
		int n = arr2.length;
		for(int  i = 0; i<n;i++) {
			if(arr2[i]%2==0) {
				evcnt++;
			}
		}
		int idx = 0;
		int[] arr3 = new int[evcnt];
		for(int  i = 0; i<n;i++) {
			if(arr2[i]%2==0) {
				arr3[idx] = arr2[i];
				idx++;
			}
		}
		prArr(arr2);
		System.out.println("");
		prArr(arr3);
	}

	public static void main(String[] args) {
		evenarray obj = new evenarray();
		obj.evarr();
	}
}
