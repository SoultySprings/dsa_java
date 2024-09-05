package dsalearn;
import java.util.*;
//To check if the given number is a palindrome number
public class palindromenum {

	public void prArr(int[] arr) {
		int n = arr.length;
		for(int  i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
	
	public boolean palnum(String word) {
		char[] arr = word.toCharArray();
		int st = 0;
		int ed = arr.length-1;
		boolean flag = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[st]!=arr[ed]) {
				flag=false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,5};
		String word = "maddam";
		Scanner sc = new Scanner(System.in);
		String word2 = sc.next();
		palindromenum obj = new palindromenum();
		obj.prArr(arr1);
		System.out.println(word);
		System.out.println(obj.palnum(word));
		System.out.println(obj.palnum(word2));
	}
}
