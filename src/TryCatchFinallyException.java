
public class TryCatchFinallyException {

	public static void main(String[] args) {
		// Try, Catch ,Finally Exception Handling Demo
		int arr[]=new int[5];
		try {
		arr[10]=100;// ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("This is finally block");
		}}}
/* result comes after run as:
 "Index 10 out of bounds for length 5
This is finally block" */
