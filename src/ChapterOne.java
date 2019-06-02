package testing;

public class ChapterOne {

	
	public static void main( String args[] ) {
		//1.1 - implement algorithm to determin if a string has all unique chars.  What if you cant use additional data structures?
		
		System.out.println( uniqueChars( "hi" ) );
		
		
		//1.2 - Implement a function void reverse( char* str) in C or C++ which reverses a null-terminated string
		char[] arr = "abcdefg\0".toCharArray();
		
		System.out.println( reverseCharArray( arr ) );
		
		//1.3 - Given 2 strings, write a method to decide if one is a permutation of the other (same num of 
		System.out.println( isPermutation( "hello", "lleoh" ) );
		System.out.println( isPermutation( "hello", "helll" ) );
		
		
		//1.4 - Write a method to replace all spaces in a strin gwith '%20'.  You may assume that the strin ghas sufficient space at the end of the strin gto hold the additional characters, and you are given length of array.  Use char array.  perform in place.  Input: ' "Mr John Smith    ", 13 '.  Output: "Mr%20John%20Smith"
		
		//1.5 - Implement a method to perform basic string compression usin gthe counts of repeated characters.  For example,  'aabcccccaaa' would become 'a2b1c5a3'.   If the compressed strin gwould not become smaller than the origional string, your method should return original string.  strin gahs only upper and lower case letters.
		
		//1.8 - assume you have a method 'isSubstring' which checks if one word is a substsring of another.  Givene two strings s1 and s2, write code t ocheck if s2 is a rotation of s1 using only one call to isSubstring.   (eg 'waterbottle' is a rotation of 'erbottlewat')
	}
	
	//1.1
	public static boolean uniqueChars(String s) {
		char[] cArray = s.toCharArray();
		for (int i=0; i<cArray.length; i++) {
			for (int j=i+1; j<cArray.length; j++) {
				System.out.println( "Comparing: " + cArray[i] + ", " + cArray[j] );
				if (cArray[i] == cArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	//1.2
	public static char[] reverseCharArray(char[] arr) {
		char[] reversed = new char[ arr.length ];
		for (int i=arr.length-1; i>=0; i--){
			reversed[arr.length - 1 - i] = arr[i];
		}
		
		return reversed;
	}
	
	//1.3
	public static boolean isPermutation(String str1, String str2) {
		// all chars in str1 are in str2 and vice versa.
		//str1 list.  [ c a r r o t ].  str2 list [ c a r t ].   For c in str1,  remove from  both str1 and str2 if found in str2.  if not found, break.  if str2 becomes empty before str1, break.  if str2 not empty at end, return 0
		boolean isP = false;
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		if (str1Array.length != str2Array.length ) {
			return false;
		}
		
		for (int i=0; i<str1Array.length; i++ ){
			for (int j=0; j<str2Array.length; j++) {
				if (str2Array[j] != '\0') {
					if (str1Array[i] == str2Array[j]) {
						str1Array[i] = '\0';
						str2Array[j] = '\0';
						break;
					}
				}
			}
			if ( str1Array[i] != '\0' ) { //no match found
				return false;
			}
		}
		
		for (int i=0; i<str1Array.length; i++ ){
			if( str1Array[i] != '\0' || str2Array[i] != '\0' ) {
				return false;
			}
		}
		
		return true;

	}
	
	
	
}

