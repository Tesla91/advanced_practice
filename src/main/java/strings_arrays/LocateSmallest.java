package strings_arrays;

import java.util.Random;

/**
 * Created by ryandesmond on 7/10/17.
 */

/* Write the code to find the smallest sum of any two numbers in an int[] of unknown length.

   Use the java.util.Random class to generate 100 random numbers between 1 and 22,222 and place them
   into the array. Iterate through this array two find the 2 numbers who's sum is smaller than any other.

    //----------------------------------------------------------------------
    import java.util.Random; // this line must come before class declaration
    //----------------------------------------------------------------------

    Random rand = new Random();
    int  n = rand.nextInt(50) + 1;
    //50 is the maximum and the 1 is our minimum

   Expected outpust:
   Original array: <contents of original array>
   Lowest sum: <a single int, the lowest sum of any two ints in the array>
*/


public class LocateSmallest {

    public static void main(String[] args) {

        Random rand = new Random();
        int array[] = new int[100];
        int min = 22222;
        int min2 = 22222;
        int i, n;


        for(n = 0; n < 100; n++) {
            array[n] = rand.nextInt(22222) + 1;
        }
        for (int x : array) {
            System.out.println(x);

        }

        for(i = 0; i < array.length-1; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println("min number is " + min);

        for(i = 0; i < array.length-1; i++) {
            if (array[i] > min && array[i] < min2 ) min2 = array[i];
        }
        int sum = min + min2;
        System.out.println("min2 number is " + min2);
        System.out.println("Sum is " + sum);

    }
}
