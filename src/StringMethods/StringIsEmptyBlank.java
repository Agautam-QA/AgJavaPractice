package StringMethods;

public class StringIsEmptyBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java is simple Language";
		String s1=new String("Java is simple language");
		String s2="";
		
		System.out.println(s1.isEmpty());
		// result prints false as s1 statement is not empty
		System.out.println(s.isBlank());
       // result prints false as statement is false
		
		System.out.println(s2.isEmpty());
		// prints result true as s2 statement is empty or blank
	}

}
