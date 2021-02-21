package ex3;
//3.1 Write a method that prints out a string array, one element per line
public class Ex1 {
	
	static void solution(String[] str) {
		for (int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void main(String args[]) {
		String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
		solution(breakfast);
	}
}
