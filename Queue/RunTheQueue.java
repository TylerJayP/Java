package labQ;

public class RunTheQueue {

	public static void main(String[] args) {

		LinkedQueue lq = new LinkedQueue();
		
		System.out.println("Is The Queue Empty Right Now? " + lq.isEmpty());

		lq.enqueue(10);
		lq.enqueue(15);
		lq.enqueue(20);
		lq.enqueue(200);
		lq.enqueue(6);
		lq.printQueue(lq.head);
		
		System.out.println("Size of Queue: " + lq.size());
		System.out.println("Is The Queue Empty Right Now? " + lq.isEmpty());
		
		//This dequeue will remove 10 from the queue
		lq.dequeue();
		lq.printQueue(lq.head);
		
		System.out.println("Size of Queue: " + lq.size());
		
		System.out.println("Peeking: " + lq.peek());
		
		lq.enqueue(8);
		lq.enqueue(35);
		lq.enqueue(4);
		lq.enqueue(12);
		lq.enqueue(25);
		lq.printQueue(lq.head);
		
		System.out.println("Size of Queue: " + lq.size());
		
		//This dequeue will remove 15 from the queue
		lq.dequeue();
		lq.printQueue(lq.head);
		System.out.println("Size of Queue: " + lq.size());
		System.out.println("Peeking: " + lq.peek());
		lq.printQueue(lq.head);
		
	}

}
