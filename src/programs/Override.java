package programs;

public class Override {
	String what;
	int time;
	public Override() {
		System.out.println("The parent class is invoked first");
	}
	
	public Override(String what,int time) {
		this.what =what;
		this.time =time;
	}
	
	void example() {
		System.out.println("This is the main class");
	}
	Override overRide() {
		return this ;
	}
	
		
		
	}


