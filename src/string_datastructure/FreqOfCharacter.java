package string_datastructure;

import java.util.HashMap;
import java.util.Map;

public class FreqOfCharacter {

	public static void main(String[] args) {
		/*
		 * String str ="pavankalayan";
		 * 
		 * str = str.toLowerCase(); int alpha[] = new int[26]; char[] cStr =
		 * str.toCharArray();
		 * 
		 * for(int i=0;i<cStr.length;i++) { alpha[cStr[i] - 97]++; } for(int i = 0;
		 * i<cStr.length;i++) { System.out.println(cStr[i] + " " + alpha[cStr[i]-97] +
		 * " "); }
		 */
		
		  String str1 = "pav,anka layan ,";
		  
		  str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		  
		  char[] cStr = str1.toCharArray();
		  
		  Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		  for (char c : cStr) {
			  if (map.containsKey(c)) {
				  int a = map.get(c); map.replace(c, ++a);
		  }
		   else { map.put(c, 1); }  // this will omit all the spaces and commas
		  //System.out.println(map);
		  
		  
		  // this will print and count all characters including space and commas 
		 for( Map.Entry<Character, Integer> entry : map.entrySet()) {
		  System.out.println(entry.getKey() + " " + entry.getValue()); 
		 }
		 }  
	}

}
