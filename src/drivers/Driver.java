package drivers;

import hashtables.*;
import linkedlist.*;

public class Driver {

	public static void main(String[] args) {
		Driver d = new Driver();
		d.createHashTable();
	}
	
	public void createHashTable() {
		
	}
	
	
	public void createSimpleHashTable() {
		String[] data = new String[]{ "abc", "123", "horse", "norse", "fog", "gof", "", }; // null, "0" };

		SimpleHashTable table = new SimpleHashTable( data.length, data );
		
		Node n = table.find("abc");
		System.out.println( n );
		
		n = table.find("gof");
		System.out.println( n );
	}
	

}
//Cooool - next make generic linked list,  then make new 'Data' node class to encapsulate sample data and make hash table and make queries