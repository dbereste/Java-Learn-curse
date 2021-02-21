package ex2;
/*
 * 2.9 Write a method that prints out a 4 x 4 table square
 * tableSquare()
2:   *** Output ***
3:  A 4 x 4 table square
4:  | 1 | 2 |  3 |  4 |
5:  | 1 | 2 |  3 |  4 |
6:  | 2 | 4 |  6 |  8 |
7:  | 3 | 6 |  9 | 12 |
8:  | 4 | 8 | 12 | 16 |
 */
public class Ex2_9 {
	
	static void tableSquare() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("|" + (i*j) + "\t");
	
			}
			System.out.print("|");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tableSquare();
	}

}
