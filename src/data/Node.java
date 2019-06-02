package data;

public abstract class Node {

	public Node next = null;
	public Node prev = null;
	String key = "";
	public Object value;
	
	
	  public Node() {}
	  public Node(Object value) { this.value = value; }
	  
	  public Node(String key, Object value) { 
		  this.key = key; 
		  this.value = value; 
	  }
	 
	public String getKey() {
		return this.key;
	}
	  
	public Node getNext() {
		return next;
	}
	public Node getPrev() {
		return prev;
	}
	public Object getValue() {
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
	
	public String toString() {
		return "Node value: " + this.value;
	}
	
}
