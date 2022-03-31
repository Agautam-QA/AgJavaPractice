package StringMethods;

public class StringReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome";
	
		s.replace('e', 'a');  // here e replace with a from given String above
		System.out.println(s.replace('e', 'a'));
		// result come Welcoma instead of Welcome now
		
		String s1="wake up and get fresh and go to work and end the day";
		s.replace("and", "C#");
		System.out.println(s1.replace("and", "C#"));
		// result prints as"wake up C# get fresh C# go to work C# end the day

	}

}
