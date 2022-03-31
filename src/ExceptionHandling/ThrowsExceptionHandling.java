package ExceptionHandling;

public class ThrowsExceptionHandling {
	static void avg() throws ArithmeticException {
		System.out.println("Inside avg funtion");
		throw new ArithmeticException("Demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			avg();
		}
		finally {
			}
		System.out.println("Caught");

	}

}
