package ex3;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=10;i<=20;i++) {
			if(i % 2==1 || i == 16) {
				continue;
			}
			System.out.println(i);
			if(i==20) {
				break;
			}
		}
	}

}
