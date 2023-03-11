package programs;

 class Override_2 extends Override {
	String when;
	int test;
	
	public Override_2(String what, int time,String when) {
		super();
		//super(what, time);
		this.when =when;
		{System.out.print("Hello man");}
		
		// TODO Auto-generated constructor stub
	}
	



	void example() {
		
		System.out.println("This is the child class");
		super.example();
		
		
	
		
	}
	
	
	
	Override_2 overRide() {
		return this ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override_2 pub = new Override_2("Implentation",9,"Tomorrow");
		((Override_2)pub.overRide()).example();
		pub.overRide().example();
		System.out.println(+pub.time+" " +pub.what+" "  +pub.when);
		Override pub2 =new Override_2("Tomorroe",8,"hello");
		
		

	}
}


