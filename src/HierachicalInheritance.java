
public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class A{
		int a=20;
		void display() {
			System.out.println("This is display method of parent class A");
		}
	}
	class B extends A{
		int b=30;
		void show() {
			System.out.println("a="+a);
			System.out.println("This is show method of child class B");
		}
		
	}
	class C extends A{
		int c=40;
		void print() {
			System.out.println("This is print method of child class C");
		}
	}

}
