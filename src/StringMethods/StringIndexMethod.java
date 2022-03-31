package StringMethods;

public class StringIndexMethod {

	public static void main(String[] args) {
		// I wanna print index of #
		
		String s="Java #is simple language";
		System.out.println(s.indexOf('#'));
		// result prints 5 as # is in 5th place while counting from 0
		
		// to print multiple ##
		
		String s1="java is #simple lang, but C is #not";
		System.out.println(s1.indexOf('#',9));
		/*result prints 31 coz
		(begining # value was 8 then for next count started from 9 to next #)*/  

	}

}
