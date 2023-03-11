package programs;

public class Stack {  
	char a[]=new char[200];  
	int top=-1;  
	void push(char c)  
	{  
	try  
	{  
	a[++top]= c;  
	}  
	catch(StringIndexOutOfBoundsException e)  
	{  
	System.out.println("Stack full, no room to push, size=200");
	System.exit(0);  
	}  
	}  
	char pop()  
	{  
	return a[top--];  
	}  
	boolean isEmpty()  
	{  
	return (top==-1)?true:false;  
	}  
	char peek()  
	{  
	return a[top];  
	}  
	}     

