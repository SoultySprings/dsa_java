package dsalearn;
//Move zeros to the end of the array without changing order
public class movezeros {

	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
	
	public void mozero(int[] arr) {
		int n = arr.length, temp;
		int j = 0;
		for(int i = 0; i<n; i++) {
			if(arr[i]!=0 && arr[j]==0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j]!=0) {
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1123,2132,0,314,0,32,345,35,0,0,35,3,45};
		movezeros obj = new movezeros();
		obj.prArr(arr1);
		obj.mozero(arr1);
		obj.prArr(arr1);
	}

}
