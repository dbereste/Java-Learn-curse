package ex3;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		for (int j=1;j<=2;j++) {
			System.out.print("Introduceti " + j + " nr pozitiv:");
			i = sc.nextInt();
			if (i>0) {
				System.out.print("Numarul este pozitiv");
			}else {
				System.out.print("Numarul este negativ");
			}
			System.out.println();
		}
		sc.close();
	}

}
