package ExceptionHandling;

public class ThrowException {
	static void checkAge(int age) {
	if(age<18) {
		throw new ArithmeticException("Access denied- must be at least 18 or above");
	}
	else {
		System.out.println("Access granted- you are old enough");
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);

	}

}
