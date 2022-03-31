
public class StaticKeyWordExample {
	int a; // non static variable
	static int b; // static variable
	static void m1()
	{
		System.out.println("this is m1- static method");
	}
	void m2()
	{
		System.out.println("this is m2- non static method");
	}
	
	public static void main(String[] args) {
		// this "main is static method because "static"is on line
		//a=100;// error comes because a is non static variable and main methd is static method
		// note: static variable/methods can only access to static stuffs
		b=100; // no error because variable and method both are static
		System.out.println(b);
		m1(); // this is static method as mentioned above
		// so the result prints as "100- this is m1 static method"
		
		//now to print non static to static , need to create object as below:
		StaticKeyWordExample se=new StaticKeyWordExample();
		se.a=200;
		System.out.println(se.a);
		se.m2();
	}

}
//now finally result of non static prints as:
//"200 this is m2- non static method"



