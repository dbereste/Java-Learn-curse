package ex2;
/*
2.4 Write a for loop to print out four random integers between 1 and 10
 */
import java.lang.Math;
public class ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			System.out.println((int)(Math.random()*10));
		}
	}

}
