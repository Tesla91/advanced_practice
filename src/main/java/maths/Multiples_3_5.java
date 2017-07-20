package maths;

import java.util.stream.IntStream;

import static com.sun.tools.doclint.Entity.sum;

/*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
    multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.

 */
public class Multiples_3_5 {
    public static void main(String[] args) {
        int max = 1000;
        int n;
        int array[] = new int[1000];


        // loop through the numbers one by one
        for (n = 1; n < max; n++) {

            //analyzes if n is a multiple of 3 or 5 and puts it into the array if it is
            for (n = 1; n < max; n++) {
                if (n % 3 == 0 | n% 5 ==0) {
                    array[n] = n;
                }
            }
            //summing up the numbers in the array and printing out the total
            int sum = IntStream.of(array).sum();
            System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + sum +"!");
        }
    }
}
