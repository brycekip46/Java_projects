package programs;

import java.util.ArrayList;

public class BinarySearch {
	// input is array size and target and the array
	static int binarySearch(int target,ArrayList<Integer> b) {
		int min,max,guess;
		min=0;
		max=b.size()-1;
		
		while(min<=max) {
			guess=Math.round((max+min)/2);
			
			if(b.get(guess)==target) {
				return guess;
			}
			else if(b.get(guess)<target) {
				
				min=guess+1;
			}else {
				max=guess-1;
				
				
			}
		
			
		
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>b=new ArrayList<Integer>();
	
		
		long startTime = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			
			if(i%2==1) {
				
				b.add(i);
			}
			b.toArray();
		}
		int index = binarySearch(999,b);
		System.out.println(index);
		long endTime = System.currentTimeMillis();
	    long searchTime = endTime - startTime;
	  System.out.print(searchTime);
	}

}
