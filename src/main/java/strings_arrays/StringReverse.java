package strings_arrays;


/**
 * This application must be called from the command line
 * You must pass a single String into the class from the command line
 * The main() must print out the contents of the String reverse order
 */

public class StringReverse {
	String str;
	StringReverse(String a){
		str = a;
	}
	void reverse(int b){
		if(b != str.length()-1) reverse(b+1);
		System.out.print(str.charAt(b));
	}

	public static void main(String[] args){

		if(args.length > 0) {
			// initialize the string from the args array
			StringReverse a = new StringReverse(args[0]);
			a.reverse(0);
			System.out.println();
			// print out the letters in reverse order
		} else System.out.println("Please enter a String to print backwards.");
	}

}
