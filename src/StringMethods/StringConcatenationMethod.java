package StringMethods;


public class StringConcatenationMethod {
	

	public static void main(String[] args) {
		// String Concatenation Method
		
		
		//concatenation (full Strings)
		
		String s1="Welcome to";
		String s2=" training!!";
		System.out.println(s1+s2);// used + operator directly
		//Result prints as "Welcome to training!!"
		
		// or in another way of concatenation as below
		
		System.out.println(s1.concat(s2));// used string variable and value
		
		// also another ways to do as below
		System.out.println("Welcome to"+" training!!");
		System.out.println("Welcome to".concat(" training!!"));

	}

}
