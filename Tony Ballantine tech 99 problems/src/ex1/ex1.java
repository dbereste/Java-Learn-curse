package ex1;
//1.1 Write a method that accepts a name as a parameter and prints out “Hello ” <name>
//1.2 Write a method that accepts two numbers and returns the average of the two numbers.

public class ex1 {
	static void hello (String s) {
		System.out.println("Hello ," + s);
	}
	
	static double add (double x, double y) {
		return ((x+y)/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello ("Daniel");
		System.out.println("Avg:" + add(2,4));
	}

}
