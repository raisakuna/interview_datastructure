

public class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) { // Start from 2, as 1 is not considered prime
            int temp = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print(i + " "); // Print the prime number, 
            }
        }
    }
}
