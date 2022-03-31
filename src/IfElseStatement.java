
public class IfElseStatement {

	public static void main(String[] args) {
// if-else, if, if-else, else-if, switch -case(control flow statement)
		
  if(true) {
	System.out.println("this is if block");
	// result prints it because if statement is inside if block
	
	//next example:
	if(false) {
		System.out.println("this is if block");
		// didn't print anything because condition is not true;that block is within if statement block
	
	//next example:
		int a=20;
		int b=30;
		
		if(a<b) {
		System.out.println("A is greater number");
		// condition is true so prints result "A is greater number"
	
// next example:
		if(a>b) {
			System.out.println("A is greater number");
		}
		else {
			System.out.println("B is greater number");
//if condition fails then result will be else: hence result below came as "B is greater number"
		}
		

}
		
	}
	
  


