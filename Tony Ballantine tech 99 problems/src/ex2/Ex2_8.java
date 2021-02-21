package ex2;
/*
2.8 Write a method that uses nested loops to produce the following pattern
1:  triangle()
2:   *** Output ***
3:  *
4:  **
5:  ***
6:  ****
7:  *****
*/
public class Ex2_8 {
	
	static void triangle() {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle();
	}

}
