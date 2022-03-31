package StringMethods;

public class StringSplitMethod {

	public static void main(String[] args) {
		// this Split method splits the statement using for loop
		
		String s="Java is simple Language";
		String strArr[]=s.split(" ");
        // need for loop to print array
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
/* result prints as below
Java
is
simple
Language*/
			
			
			
		}
	}

}
