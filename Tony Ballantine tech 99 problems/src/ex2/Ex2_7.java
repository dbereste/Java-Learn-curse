package ex2;
//2.7 Write a program that outputs “Are we there yet?” and then waits for input. 
//If the input is “Yes” the program outputs “Good!” and exits, otherwise the program loops.
import java.util.Scanner;
public class Ex2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sa = true;
		Scanner sc = new Scanner(System.in);
		String s="";
		while (sa) {
			System.out.println("Are we there yet?");
			s = sc.nextLine();
			if (s.equals("Yes")) {
				System.out.println("Good!");
				sa= false;
			}
		}
		sc.close();
	
	}
	
}
