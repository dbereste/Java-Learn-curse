package ex2;
//2.6 Write a method to print out the powers of 2 from 2^1 up to 2^n
public class ex2_6 {
	
	static void solution(int n) {
		int s=1;
		for (int i=1;i<=n;i++) {
			s*=2;
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(10);
	}

}
