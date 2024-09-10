package hashMap;

import java.util.HashMap;
import java.util.Map;


public class HashMap1 {
	
	static void HashMapMethods() {
	// HashMap is an implementation of interface Map
Map<String, Integer> mp = new HashMap<>();	

	//Adding Elements
	mp.put("Akash",21);
	mp.put("Vaani", 23);
	mp.put("Raksha", 17);
	mp.put("Sam",25);
	mp.put("Kite", 19);
	mp.put("John", 37);
	
	// Print all * Look carefully Insertion order doesn't follow here
	System.out.println(mp); 

	
	// Getting  value of a key from the Hashmap
	System.out.println(mp.get("Akash"));  // 21
	System.out.println(mp.get("Dan"));	//null
	
	// Changing/updating value of a key in the HashMap
	System.out.println(mp.put("Akash", 25));
	// Check update
	System.out.println(mp);

	
	//Removing a pair from the HashMap
	System.out.println(mp.remove("Akash"));    // remove akash
	System.out.println(mp);
	System.out.println(mp.remove("Reiya"));  // null
	
	// check if a key is in a hash map
	System.out.println("Check if a key contains in a hashmpa, returns \"true \" or \"false\" " );
	System.out.println(mp.containsKey("Akash"));  //false
	System.out.println(mp.containsKey("Vaani"));  // true
	
	// Adding a new entry only if the new key doesn't exist already
	System.out.println(mp.putIfAbsent("Yashika", 30)); // Will enter Yashika
	System.out.println(mp.putIfAbsent("Vaani", 34));	// Will not enter Vaani becuase Vaani already exist
	System.out.println(mp);
	
	// Get all keys in Hashmap
	System.out.println("Get all keyset " + mp.keySet());    // Returns all keys in set type is "String" (Collectin that contain no duplicate)
	
	// Get all the values
	System.out.println(mp.values());   // Returns all the values type is "Integer"in Collection (a group of Objects)
	
	// Get all entries in the Hashmap
	System.out.println("entreySet " + mp.entrySet());  // Returns a set view of mappings which is of type "Entry" 
	
	//Traversing all entries of Hashmap- multiple methods
	for (String key : mp.keySet()) {
		System.out.printf("Age of %s is %d\n", key, mp.get(key));
	}
	
	System.out.println("=========== this is the standard one ================");
	for(Map.Entry<String, Integer> e : mp.entrySet()) {
		System.out.printf("Age of %s is %d\n" , e.getKey(), e.getValue());
	}
	}
	public static void main(String [] args) {
		HashMapMethods();
	}
	

}
