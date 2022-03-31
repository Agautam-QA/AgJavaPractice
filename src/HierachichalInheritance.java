
public class HierachichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
System.out.println("a="+b.a+" b="+b.b);
b.display();
b.show();
//b.print();// error coz child can access parent but not another siblings

C c=new C();
System.out.println("a="+c.a+" c="+c.c);

c.display();
//c.show();// c can't access b as it is sibling class
c.print();
	}

}
class A{
	int a=20;
	void display() {
		System.out.println("this is display method of class A");
	}
}
class B extends A{
	int b=30;
	void show() {
		System.out.println("class B show method ");
	}
}
class C extends A{
	int c=40;
	void print() {
		System.out.println("This is print method of class C");
		
	}
}
