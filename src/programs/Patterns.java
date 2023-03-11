package programs;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
	public static void main ( String[]args) {
		
	ArrayList<String> Password = new ArrayList<String>();
	Password.add("Bark7545");
	Password.add("bark7545");
	Password.add("BArk7545");
	
	Scanner pass = new Scanner(System.in);
	String passwd = pass.nextLine();
	pass.close();
	boolean b=true;
	try {
		int t=4/0;
	for(int i=0;i<5;i++) {
		
		
		if(Pattern.compile(passwd).matcher(Password.get(i)).matches()) {
			b=true;
			break;
		} else {
		b=false;
		}
	}
	if(b) {
		System.out.println("Password is correct");
	}else {
		System.out.print("pasword incorrect");
	}
	
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	
	System.out.println("HELO WORLD");
	}
}
	


