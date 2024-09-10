package string_datastructure;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) { // Start the loop from 1
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i)); // Add the integer as a string
            }
        }

        return list; // Return the list of strings
    }

    public static void main(String[] args) {
        FizzBuzz solution = new FizzBuzz();
        List<String> result = solution.fizzBuzz(15);

        // Print the result
        for (String str : result) {
            System.out.println(str);
        }
    }
}
