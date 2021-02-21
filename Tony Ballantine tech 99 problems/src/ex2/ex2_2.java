package ex2;
/*
2.1 Write a method that prints the numbers 1 to 10
2.2 Write a method that prints the positive odd numbers less than 20
2.3 Write a method that prints the square numbers up to 100
2.4 Write a for loop to print out four random integers between 1 and 10
2.5 Write a method to print out the positive even numbers less than n
2.6 Write a method to print out the powers of 2 from 2^1 up to 2^n
2.7 Write a program that outputs “Are we there yet?” and then waits for input. 
	If the input is “Yes” the program outputs “Good!” and exits, otherwise the program loops.
2.8 Write a method that uses nested loops to produce the following pattern
2.9 Write a method that prints out a 4 x 4 table square
2.10Extend your answer to the last question produce a method that will print out a n x n table square
 */
public class ex2_2 {

	static void solution() {
		for (int i=1;i<20;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String args[]) {
		solution();
	}
}
