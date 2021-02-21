package ex2;
/*
 * 2.10Extend your answer to the last question produce a method that will print out a n x n table square
 *  1:  tableSquares(6)
 2:   *** Output ***
 3:  A 6 x 6 table square
 4:  | 1 |  2 |  3 |  4 |  5 |  6 |
 5:  | 2 |  4 |  6 |  8 | 10 | 12 |
 6:  | 3 |  6 |  9 | 12 | 15 | 18 |
 7:  | 4 |  8 | 12 | 16 | 20 | 24 |
 8:  | 5 | 10 | 15 | 20 | 25 | 30 |
 9:  | 6 | 12 | 18 | 24 | 30 | 36 |
 */
public class Ex2_10 {
	
	static void tableSquare(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("|" + (i*j) + "\t");
	
			}
			System.out.print("|");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tableSquare(6);
	}

}
