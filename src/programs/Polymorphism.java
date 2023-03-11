/**
 * 
 */
package programs;

public class Polymorphism extends Palindrome {
	 static Palindrome A;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A=new Polymorphism();
		Polymorphism b = (Polymorphism) new Palindrome();
		boolean hence = A instanceof Palindrome;
		System.out.println(hence);
		

	}

}
