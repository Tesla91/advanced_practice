package strings_arrays;

import java.util.Random;

/**
 * Created by ryandesmond on 7/10/17.
 */

/* Write the code to find the smallest sum of any two numbers in a 2 dimensional array int[][] - both of unknown length.

    Use the java.util.Random class to generate 2 Random Numbers between 1 and 30. 1 number will be the 1st dimension
    of your array (the vertical array). The second number will be the 2nd dimension (the horizontal array).

   //----------------------------------------------------------------------
    import java.util.Random; // this line must come before class declaration
    //----------------------------------------------------------------------

    Random rand = new Random();
    int  n = rand.nextInt(50) + 1;
    //50 is the maximum and the 1 is our minimum

    As Before, use the java.util.Random class to generate 100 random numbers between 1 and 22,222 and place them
    into the array. Iterate through this array two find the 2 numbers who's sum is smaller than any other.

    Expected outpust:
    Original array: <contents of original array>
    Lowest sum: <a single int, the lowest sum of any two ints in the array>
*/

public class LocateSmallest2Dim {

    public static void main(String[] args) {

        Random rand = new Random();
        int array[][];
        int  n = rand.nextInt(30) + 1;
        int  m = rand.nextInt(30) + 1;
        array = new int[n][m];
        int min = 22_222;
        int min2 = 22_222;

        System.out.println("Original array: ");
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array[x].length; y++) {
                array[x][y] = rand.nextInt(22_222) + 1;
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                } else if (array[i][j] < min2) {
                    min2 = array[i][j];
                }
            }
        }
        System.out.println("min number is " + min);
        System.out.println("min2 number is " + min2);

        int sum = min + min2;
        System.out.println("Sum is " + sum);

    }

}
