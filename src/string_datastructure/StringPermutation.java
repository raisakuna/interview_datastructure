package string_datastructure;

public class StringPermutation {

		   // Function to display all permutations of the string str
		   static void printallPermutns(String str, String str2)
		   {
		       // check if string is empty or null
		       if (str.length() == 0) 
		         {
		           System.out.print(str2 + " ");
		           return;
		         }
		      
		       for (int i = 0; i < str.length(); i++) 
		         { 
		           // ith character of str
		           char ch = str.charAt(i); 
		           // Rest of the string after excluding
		           // the ith character
		           String str3 = str.substring(0, i) + str.substring(i + 1);
		           // Recursive call
		           printallPermutns(str3, str2 + ch);
		        }
		   } 
		   // Driver code
		   public static void main(String[] args)
		   {
		       String s = "cat";
		       printallPermutns(s, "");
		   
		}

	

	

}
