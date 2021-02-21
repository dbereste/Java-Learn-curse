package ex3;
//Write a method that reverses the elements of an Array
public class Ex4 {

	static String[] reverse (String[] n){
		String temp = "";
		for(int i=0;i<n.length/2;i++) {
			temp = n[i];
			n[i]=n[n.length-i-1];
			n[n.length-i-1]=temp;
		}
		return n;
	}
	
	public static void main (String args[]) {
		String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
		breakfast = reverse(breakfast);
		
	}
	
}
