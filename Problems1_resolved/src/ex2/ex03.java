package ex2;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =-1;
		if (age > 0 && age < 12) {
			System.out.println("Copil");
		}else if (age >= 12 && age < 18) {
			System.out.println("Adloescent");
		}else if (age >=18) {
			System.out.println("Adult");
		}else {
			System.out.println("Unknown Error");
		}
	}

}
