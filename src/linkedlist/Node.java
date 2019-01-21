package linkedlist;

public class Node {

	Node next = null;
	Node prev = null;
	String value;
	
	
	public Node(String value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public Node getPrev() {
		return prev;
	}
	public String getValue() {
		return value;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
