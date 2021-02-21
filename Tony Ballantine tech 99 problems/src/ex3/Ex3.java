package ex3;
//Write a method that returns the last but one element of a string array
public class Ex3 {
	
	static String last_but_one(String[] str) {
		return (str[(str.length)-2]);
	}
	
	public static void main(String args[]) {
		String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
		System.out.println(last_but_one(breakfast));
	}
	
}
