package programs;


public class Palindrome {
	 public void checkPalindrome(int m) {
		for(int i=0;i< m;i++) {
			//converts  the string to a mutable String buffer then reverses the sequence then returns it to a string
			String temp2 = new StringBuffer(String.valueOf(i)).reverse().toString();
			//converts the string to integer
			int b=Integer.parseInt(temp2);
			if(i==b) {
				System.out.println("The number "+i+"  is a palindrome");		
			}
			
		}
	}
	
	public static void main (String []Args) {
		//Generation of Palindrome numbers 1-50;
		new Palindrome().checkPalindrome(10000);
		}
	
}
