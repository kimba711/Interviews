package linkedlist;

public class LinkedList {

	Node head = null;
	
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public LinkedList() {};

	public void addNode(Node node) {
		if( this.isEmpty() ) {
			this.head = node;
		}
		else {
			Node n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = node;
			
		}
	}
	
	
	public void addValue( String val ) {
		this.addNode( new Node( val ) );
	}
	
	private boolean isEmpty() {
		return this.head == null;
	}
	
	public void deleteNode( Node n ) {
		if( !this.isEmpty() ){
			//Node n = this.head;
			Node prev = n;
			while(n.next != null){
				prev = n;
				n = n.next;
			}
			prev.next = null;
		}
	}
	
	public void deleteFirst() {
		if (!this.isEmpty() ){
			this.head = this.head.next;
		}
	}
	
	public Node find( String val ){
		Node n = head;
		while(n != null){
			if( n.value == val ){
				return n;
			}
			n = n.next;
		}
		return null;
	}

	public void print() {
		Node n = head;
		while(n != null){
			System.out.print(n.value + " ");
			n = n.next;
		}
		System.out.println();
	}
	

	public static void main( String[] args ){
		
		LinkedList list = new LinkedList( new Node( "hi" ) );
		list.addValue( "bye" );
		list.addValue( "Steve" );
		list.addValue( "Stacy" );
		list.addValue( "Bob" );
		list.deleteNode( new Node( "Stacy" ) );
		list.print();
		//list.deleteFirst();
		//list.print();
		Node steve = list.find( "Steve" );
		if( steve != null ) {
			System.out.println( steve.value );
		}
		
		
	}


}
