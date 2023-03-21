
package programs;
import java.util.*;
public class Fibonacci {
	public static int fibonacii(int n, int a , int b) {
		if (n==0) {
			return 0;
		}else {
			return fibonacii((n-1),a+b,a);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generation of fibonacci sequence numbers
		//follows that (0+1)->1(1+0)->1(1+1)-> 2(1+2)3 
		Scanner myObj = new Scanner(System.in);
		int n = myObj.nextInt();
		int temp,n1=0,n2=1;
		for(int i=0;i<n;i++) {
			
			temp=n1+n2;
			System.out.print(temp+ " ");
			n2=n1;
			n1=temp;
			
			
		}
		myObj.close();

	}

}
