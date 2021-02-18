package labQ;

public class LinkedQueue {

	int n;
	Node head, tail;
	
	
	private class Node {
		
		Integer data;
		Node next;
		
		
		private Node(Integer data) {
			
			
			this.data = data;
			next = null;
			
		}
		
		
	}

	
	public  int size() {
		
		
		Node temp = head;
		int nodeCount = 0;
		
		while(temp != null) {
			
			temp = temp.next;
			nodeCount++;
			
		}
		
		return nodeCount;
		
	}
	
	public boolean isEmpty() {
		
		return head == null;
		
	}
	
	
	public void enqueue(Integer data) {
		
		Node temp = new Node(data);
				
		if(this.tail == null) {
			
			this.head = this.tail = temp;
			return;
			
		}
		
		this.tail.next = temp;
		this.tail = temp;
		
	}
	
	
	public void dequeue() {
		
		if(this.head == null) {
			
			return;
			
		}
		
		this.head = this.head.next;
		
		if(this.head == null) {
			
			this.tail = null;
			
		}
		
	
	}
	
	
	public Integer peek() {
		
		if (!isEmpty()) {
			
			return head.data;
			
		}else {
			
			System.out.println("The Stack is empty");
			return -1;
			
		}
		
		
	}
	
	public void printQueue(Node front) {
		Node temp = front;
		System.out.print("\nQueue: ");
		while (temp != null) 
		{
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	
}
