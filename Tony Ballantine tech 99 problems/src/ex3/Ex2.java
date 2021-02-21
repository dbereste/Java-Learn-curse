package ex3;
//Write a method that returns the last element of a string array
public class Ex2 {

	static String last_arr(String[] str) {
		return (str[str.length-1]);
	}
	
	public static void main(String args[]) {
		String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
		System.out.print(last_arr(breakfast));
	}
}
