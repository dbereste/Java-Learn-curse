package ex3;
//3.5 Write a method that tests to see if an array is palindromic, i.e. the elements are the same when reversed.
public class Ex5 {

	static boolean is_pali(String[] arr) {
		boolean is_true = true;
		for (int i=0;i < (arr.length/2);i++) {
			if(!arr[i].equals(arr[arr.length -i -1])) {
				is_true = false;
			}
		}
		return is_true;
	}
	
	public static void main(String[] args) {
		String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String [] lonely = {"solo"};
        String [] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
		System.out.println(is_pali(breakfast));
		System.out.println(is_pali(lonely));
		System.out.println(is_pali(palindromic));
		 
	}
	
}
