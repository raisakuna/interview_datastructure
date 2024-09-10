package map;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> mDemo = new HashMap<Integer, String>();
        mDemo.put(101, "John");
        mDemo.put(102, "Abas");
        mDemo.put(103, "Pratik");
        mDemo.put(104, "Prayas");

		/*
		 * System.out.println(mDemo); System.out.println(mDemo.get(102));
		 * 
		 * System.out.println(mDemo.containsKey(105));
		 * System.out.println("************"); System.out.println(mDemo.clone());
		 * 
		 * System.out.println(mDemo.containsValue("test"));
		 */
        
        System.out.println("Keyset =>" + mDemo.keySet());
        System.out.println("Value =>" + mDemo.values());
        
        for(Object i: mDemo.keySet()) {
        	System.out.println(i);
        }
        System.out.println("=============");
        for(int i: mDemo.keySet()) {
        	System.out.println(i);
        }
        System.out.println("=============");

        for(Object iObject : mDemo.values()) {
        	System.out.println(iObject);
        }
        
        System.out.println("=============");
        
        for(Object i: mDemo.keySet()) {
        	System.out.println(i + " " + mDemo.get(i));
        }
    }
}
