
public class HandleException {

	public static void main(String[] args) {
		// Handle Unchecked Exception
		/*System.out.println("Program is started");
		
		int a=20;
		System.out.println(a/0);*/
	//if I run result comes as "Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at HandleException.main(HandleException.java:8")
		//so let's handle this as below:
		
		System.out.println("Program is started");// exception class
		int a=20;
		
		try {
			System.out.println(a/0);
			}
		catch(ArithmeticException e) {// we put error message (ArithmeticException) here to execute
		System.out.println(	e.getMessage());// e is just variable
		}
			
		System.out.println("program is in progress");
		System.out.println("program is completed");}}

/*Result now:

Program is started
/ by zero
program is in progress
program is completed*/


	


