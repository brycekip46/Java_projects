package programs;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner prime = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a =prime.nextInt();
		int m=a/2;
		if(a==0|| a==1) {
			System.out.println("Th number is not prime" );
			
		}else 
			for(int i=2;i<=m;i++) {
				if(a%i==0) {
					System.out.println("The number is not prime");
					flag=1;
					break;
				}
				
			}
		if(flag==0) {
			System.out.println("Is prime");
		}
		
		
	}

}
