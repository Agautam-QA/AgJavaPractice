
public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
		int c=10;
		
		
		if(a>b && a>c) {
			System.out.println("A is greater number");
			//condition false so doesn't print anything
		}

		else if(b>a && b>c ) {
			System.out.println("B is greater number");
			// condition true so prints this statement
			
		
	
		}
		else {
			System.out.println("C is greater number");
			//else if condition was true and printed already so this doesn't print
		}
		System.out.println("End of if else");
//extra ending statement only
	}

}
