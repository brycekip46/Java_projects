package programs;

public class Queue {

	int SIZE=10;
	int values[]= new int [SIZE];
	int front,rear;
	
	@SuppressWarnings("resource")
	Queue(int size){
		this.SIZE=size;
		front= -1;
		rear=-1;
		
	}
	//check if the queue is full
	boolean isFull() {
		if(front==0 && rear==SIZE -1) {
		return true;
	}else {
		return false;
	}
	}
 //check if it is empty
	boolean isEmpty() {
		if(front==-1) {
		return true;}
		else {
	    return false;
		}
		}
	//insert elements to the queue
	void enQueue(int vals) {
		//if queue is full
		if(isFull()) {
			System.out.println("The queue is full");
		}else {
			if(front== -1) {
				//mark front to denote first element in the queue
				front =0;
			}
			rear++;
			//insert elements at the rear
			values[rear]=vals;
			System.out.println("Inserted"+vals);
		}
		
	}
	//deletion algorithm
	int deQueue() {
		int element;
		
		//if queue is empty
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		}
		else {
			//remove element from the front
			element=values[front];
			//if the queue has only one element
			if(front>=rear) {
				front=-1;
				rear=-1;
				
			}
			else {
				//mark the next as front
				front++;
				
			}
			System.out.println(element+"is Deleted");
			return (element);
		}
	}
	//display elements
	void displayElements() {
		int j;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		}
		else {
			//display the front
			System.out.println("\n Front index->"+front);
		//displqy element of the queue
			System.out.println("Items ->");
			for(j=front;j<=rear;j++) {
				System.out.println(values[j]+"");
				
				
				//display the rear 
				System.out.println("\n Rear index->"+rear);
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
