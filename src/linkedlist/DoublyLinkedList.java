package linkedlist;

public class DoublyLinkedList {

	Node head = null;
	Node tail = null;
	
	public void addNode(Node node) {
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			Node n = head;
			while(n != null && n.next != null){
				n = n.next;
			}
			n.next = node;
			node.prev = n; 
			
		}
	}
	
}
