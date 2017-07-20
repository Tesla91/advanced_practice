package maths;

/*
 * By listing the first four prime numbers: 2, 3, 5 and 7, we can see that the 6th prime number is 13.
 *
 * What is the 777th prime number?
 */

public class Primes1 {
    public static void main(String[] args) {
        int max = 6000;
        int count =0;

        // loop through the numbers one by one
        for (int n = 2; n < max; n++) {
            boolean prime = true;

            //analyzes if n is prime
            for (int j = 2; j < n; j++) {
                if (n % j == 0 ) {
                    prime = false;
                }
            }

            //counts every time a prime is found
            if (prime) {
                count ++;
            }

            //prints out the 777th prime found
            if (count == 777 && prime) {
                System.out.println("The 777th prime number is " + n + "!");
            }
        }
    }
}