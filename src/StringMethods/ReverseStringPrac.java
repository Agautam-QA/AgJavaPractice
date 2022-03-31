package StringMethods;

public class ReverseStringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="The Sky is blue";
		char[] c=s.toCharArray();
		int length=c.length;
		
		System.out.println("string length is "+length);
		for(int i=length-1;i>=0;i--) {
			System.out.print(c[i]);
		}

	
	}

}
