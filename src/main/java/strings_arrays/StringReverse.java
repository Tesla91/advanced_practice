package strings_arrays;

public class StringReverse {
	String str;
	StringReverse(String a){
		str = a;
	}
	void reverse(int b){
		if(b != str.length()-1) reverse(b+1);
		System.out.println(str.charAt(b));
	}
    /*
    This application must be called from the command line
    You must pass a single String into the class from the command line
    The main() must print out the contents of the String reverse order
     */
	public static void main(String[] args){

	    // initialize the string from the args array
		StringReverse a =  new StringReverse ("Write this string backwards");
		a.reverse(0);
        // print out the letters in reverse order
	}

}
