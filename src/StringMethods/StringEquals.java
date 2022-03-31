package StringMethods;

public class StringEquals {

	public static void main(String[] args) {
		//Equals- comparing 2 strings and result comes in boolean value
		
		String s3="WELCOME";
		String s4="welcome";
		
		System.out.println(s3.equals(s4));// statement is false so print false
		System.out.println(s3.equalsIgnoreCase(s4));// now statement becomes true

	}

}
