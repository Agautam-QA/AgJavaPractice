package ExceptionHandling;

public class HandlingMultipleException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

	int[]a= {4,5,1};
	System.out.println(a[3]);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception happened");
			}
		}

}
