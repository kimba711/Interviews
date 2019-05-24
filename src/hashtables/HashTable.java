package hashtables;

import genericlinkedlist.*;
import data.*;
import java.util.ArrayList;

/*
 * 
 * 1) The hash value is fully determined by the data being hashed.
 * 2) The hash function uses all the input data.
 * 3) The hash function "uniformly" distributes the data across the entire set of possible hash values. 
 * 4) The hash function generates very different hash values for similar strings. bog / gob
 */

public class HashTable {

	// HashTable contains T's of any size
	// array of linked lists . cannot be expandable becuase we find location by
	// doing mod length
	private LinkedList[] hashTable;

	public HashTable(int size, Node[] data) {
		this.hashTable = new LinkedList[size];
		for (int i = 0; i < data.length; i++) {
			this.insert(data[i]);
		}
	}
	public HashTable(int size){
		this.hashTable = new LinkedList[size];
	};

	public void insert(Node data) {
		int hashKey = this.getKey(data.getKey());
		if (this.hashTable[hashKey] == null) {
			this.hashTable[hashKey] = new LinkedList();
		}
		this.hashTable[hashKey].addNode(data);
	}

	/***
	 * Identify bucket in hashtable for this value by hashing it, then search values
	 * in corresponding Linked list for this value
	 * 
	 * @param key
	 ***/
	public Node find(String dataKey) {
		int hash = this.hash(dataKey);
		Node n = this.hashTable[hash].find(dataKey);
		if (n == null) {
			System.out.printf("Could not find %s in hash table", dataKey);
		}
		return n;
	}

	public int getKey(String dataKey) { // hashcode mod length
		return this.hash(dataKey);
	}

	/***
	 * Convert String value of any size to UNIQUE hashtable key. cant be ANY
	 * collisions
	 * 
	 * @param value
	 * @return
	 */
	private int hash(String dataKey) {
		char[] val = dataKey.toCharArray();
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
