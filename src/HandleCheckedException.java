
public class HandleCheckedException {
	
	void m1()throws InterruptedException{
	Thread.sleep(4000);
	}

	public static void main(String[] args) throws InterruptedException {
		// Checked Exception Handling
		
		System.out.println("Program is started");
		System.out.println("Program is in prgress");
		
		/*try {
			Thread.sleep(4000);// checked exception
		}
		catch(InterruptedException e) {
		e.printStackTrace();		
			
		}*/
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");}}
/* hence the resule appears as:
 
Program is started
Program is in prgress
Program is completed
Program is exited*/

	
