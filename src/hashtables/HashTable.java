package hashtables;

import linkedlist.*;
import java.util.ArrayList;

public class HashTable {

	//HashTable contains Strings of any size
	//array of linked lists .  cannot be expandable becuase we find location by doing mod length
	private LinkedList[] hashTable = new LinkedList[ 100 ];
	
	public void insert( String value ){
		int key = this.getKey( value );
		///this.hashTable[ key ]


	}
	
	public String find( String key ){
		
		return "";
	}
	
	public int getKey( String value ){  //hashcode mod length
		return this.hash( value ) % this.hashTable.length;
	}
	
	/*** 
	 * Convert String value of any size to UNIQUE hashtable key.  cant be ANY collisions
	 * @param value
	 * @return
	 */
	private int hash( String value ){
		
		return 0;
	}
	
	
	//On collisions, we can compare the hashcodes, if not equal then we add that key/val as a new Node.  
	// when given a key to acquire the value, if there are multiple Nodes then we get all key hashcodes and compare those against the input key
	
}
