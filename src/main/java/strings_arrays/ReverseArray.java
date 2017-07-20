package strings_arrays;
/*
    Write the code to reverse the order of a standard array in place. Do not create a second array.
 */

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[100];

        System.out.println("Array before reversal.");
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        // now reverse the array in place - do not create a second array and copy values into it
        // change test
        System.out.println("Array after reversal.");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(arr[i]);
        }
    }

}
