package programs;
import java.util.*;

public class Prefix {
	static Stack operators=new Stack();
	public static void main(String[]args) {	
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the infix expression");
		String infix =myObj.nextLine();
		System.out.println("The prefix expression is"+new StringBuffer(toPrefix(infix)).reverse().toString());
		myObj.close();
	}
		
		private static String toPrefix(String infix)  
		//converts an infix expression to prefix 
		{  
		char symbol;  
		
		infix=new StringBuffer(infix).reverse().toString();
		StringBuilder sb= new StringBuilder(infix);
		for(int j=0;j<sb.length();j++) {
			if(sb.charAt(j)==')'){
				sb.setCharAt(j, '(');}
			else if (sb.charAt(j)=='(') {
				sb.setCharAt(j,')');
			}
		}
		infix=sb.toString();
			
		String prefix = "";
		for(int i=0;i<infix.length();++i)  
		//while there is input to be read  
		{  
		symbol = infix.charAt(i);  
		//if it's an operand, add it to the string  
		if (Character.isLetter(symbol))  
		prefix = prefix + symbol;  
		else if (symbol=='(')  
		//push (  
		{  
		operators.push(symbol);  
		}  
		else if (symbol==')')  
		//push everything back to (  
		{  
		while (operators.peek() != '(')  
		{  
		prefix = prefix + operators.pop();  
		}  
		operators.pop();        //remove '('  
		}  
		else  
		//print operators occurring before it that have greater precedence  
		{  
		while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= prec(operators.peek()))  
		prefix = prefix + operators.pop();  
		operators.push(symbol);  
		}  
		}  
		while (!operators.isEmpty())  
		prefix = prefix + operators.pop();  
		return prefix;  
		}  
		static int prec(char x)  
		{  
		if (x == '+' || x == '-')  
		return 1;  
		if (x == '*' || x == '/' || x == '%')  
		return 2;  
		return 0;  
		}
	
		
	

}
