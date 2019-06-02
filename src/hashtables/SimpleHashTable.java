package hashtables;

import linkedlist.*;
import java.util.ArrayList;

/*
 * 
 * 1) The hash value is fully determined by the data being hashed.
 * 2) The hash function uses all the input data.
 * 3) The hash function "uniformly" distributes the data across the entire set of possible hash values. 
 * 4) The hash function generates very different hash values for similar strings. bog / gob
 */

public class SimpleHashTable {

	// SimpleHashTable contains T's of any size
	// array of linked lists . cannot be expandable becuase we find location by
	// doing mod length
	private LinkedList[] hashTable;

	public SimpleHashTable(int size, String[] values) {
		this.hashTable = new LinkedList[size];
		for (int i = 0; i < values.length; i++) {
			this.insert(values[i]);
		}
	}
	public SimpleHashTable(int size){
		this.hashTable = new LinkedList[size];
	};

	public void insert(String value) {
		int key = this.getKey(value);
		Node newNode = new Node(key, value);
		if (this.hashTable[key] == null) {
			this.hashTable[key] = new LinkedList();
		}
		this.hashTable[key].addNode(newNode);
	}

	/***
	 * Identify bucket in hashtable for this value by hashing it, then search values
	 * in corresponding Linked list for this value
	 * 
	 * @param key
	 ***/
	public Node find(String key) {
		int hash = this.hash(key);
		Node n = this.hashTable[hash].find(key);
		if (n == null) {
			System.out.printf("Could not find %s in hash table", key);
		}
		return n;
	}

	public int getKey(String value) { // hashcode mod length
		return this.hash(value);
	}

	/***
	 * Convert String value of any size to UNIQUE hashtable key. cant be ANY
	 * collisions
	 * 
	 * @param value
	 * @return
	 */
	private int hash(String value) {
		char[] val = value.toCharArray();
		int sum = 0;
		for (int i = 0; i < val.length; i++) {
			sum += val[i] * (i+1);
		}
		return sum % this.hashTable.length;

	}


	// On collisions, we can compare the hashcodes, if not equal then we add that
	// key/val as a new Node.
	// when given a key to acquire the value, if there are multiple Nodes then we
	// get all key hashcodes and compare those against the input key

}
