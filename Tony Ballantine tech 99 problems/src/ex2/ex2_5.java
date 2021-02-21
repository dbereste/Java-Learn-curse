package ex2;
//2.5 Write a method to print out the positive even numbers less than n
public class ex2_5 {
	static void solution(int n) {
		for(int i=n;i>0;i--) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(53);
	}

}
