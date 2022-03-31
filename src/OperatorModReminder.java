
public class OperatorModReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=0;
		int div=0;
		int rem=0;
		
		div=a/3;
		rem=a%3;
		System.out.println("a= "+a+" div= " +div+ " rem= "+rem);
//if we use 2 result comes a=20 div=10 rem=0
		//if we use 3 then result comes a=20 div=6 rem=2
		
		// next example:
		int x=20;
		x++;
		int z=x%2;
		System.out.println(z);
		//(remainder result comes 1)
	}

}
