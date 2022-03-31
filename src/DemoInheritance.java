
public class DemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step 3
		B b=new B(); // created object to access v
		System.out.println(b.d); // to bring child class to parent class
		b.printNumber();
		System.out.println("b= "+b.b+" c="+b.c);
		b.display();

	}

}
//step 1
class A{// parent class
	int b=30;
	int c=40;
	void display() {
		System.out.println("b= "+b+" c="+c);
		
		
	}
}
// step 2
class B extends A{ // child class
	int d=50;
	void printNumber() {
		System.out.println("d= "+d);
	}
}