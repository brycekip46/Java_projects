package programs;
import java.util.*;

public class Armstrong_Number {
public static void  amstrongCheck(int m,int i) {
	for(int j=m;j<=i;j++) {
		
		//convert the integer to string
		String temp = String.valueOf(j);
		//convert the string to array of characters
		char [] tempChar = temp.toCharArray();
		//initialize variables that will return the totals 
		Integer result = 0;
		int total=0;
	//enter a loop to find the power of each numeral in the number
		for (int i_1=0;i_1<tempChar.length;i_1++) {
			//initialize temporary variable for conversion of character to integer 
			char b =tempChar[i_1];
			int a = Character.getNumericValue(b); 
			//raise the integer to the power of the length of the array (which is the same as the number of place values of the number)
			result =(int) Math.pow(a, tempChar.length);
			//re aggregate the numbers to the value total
			total+=result;
		}
		//find if the re-aggregated number is equal to the initial value
		if(j==total) {
			System.out.print("The number "+j+"is an Am strong number\n");	
		}	
		}	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize a scanner for entry of the start number
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int m = myObj.nextInt();
		//Use the scanner object for entry of the end number
		System.out.println("Enter the last number");
		int i = myObj.nextInt();
		myObj.close();
		//enter a loop for the given limits
		amstrongCheck(m,i);
		}
	}