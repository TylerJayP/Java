package linkedList;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		
		linkedList ll = new linkedList();
		
		
		ll.append(5);
		ll.append(6);
		ll.append(4);
		ll.append(9);
		ll.append(1);
		ll.printList();
		
		ll.prepend(2);
		ll.prepend(5);
		ll.prepend(8);
		ll.printList();
	
		ll.deleteWithValue(5);
		ll.deleteWithValue(4);
		ll.printList();
		
	}
	
}
