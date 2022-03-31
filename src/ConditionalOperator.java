
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=40;
		int b=50;
		int c=30;
		int result=0;
		
		
		 result=a>b?a:b;//(a greater than b then a otherwise b)
		 
		 System.out.println(result);
		 // a is not greater than b so result came out of b
// next example:
		 result=(a>b && a>c)?a:b;
		 System.out.println(result);
	}

}
