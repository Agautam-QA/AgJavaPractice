
public class ArithmeticOperatorsTogether {

	public static void main(String[] args) {
		// Arithmetic: +-*/% ++(increment),--(decrement)
		
		int a=10;
		int b=20;
		int c=25;
		int d=25;
System.out.println("a+b = " +(a+b));// +operator(result a+b=30)
System.out.println("a-b = "+(a-b));  // - operator
System.out.println("a*b = "+(a*b)); //* multiply operator
System.out.println("b/a = "+(b/a));  // / division operator
System.out.println("b%a = "+(b%a));  //% mudl operator (rem value 0)
System.out.println("c%a = "+(c%a));//% mud operator (rem value )
System.out.println("a++ = "+(a++)); // print value of a then increments+1=11will print on next statement
System.out.println("a-- = "+(a--)); // decrementing
		// check difference in d++ and ++d
System.out.println("d++ = "+(d++));// post increment (result comes 25at first then increment by 1in next
System.out.println("++d = "+(++d)); // pre increment(25 becomes 26 from above then +1=27
		

	}

}
