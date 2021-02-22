package ex3;
//3.6 Write a method to print out an int array with consecutive duplicates eliminated
public class Ex6 {

	static void printarr(int[] arr) {
		int temp=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==temp) {
				continue;
			}
			System.out.println(arr[i]);
			temp =arr[i];
		}
	}
	
	public static void main (String[] args) {
		int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
		printarr(nums);
	}
}
