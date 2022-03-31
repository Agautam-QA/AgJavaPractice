
public class VariableTypeInJava {
	int b=40;//instance variable (inside class, outside method)
	
	public static void main(String[] args) {
		VariableTypeInJava obj1=new VariableTypeInJava(); 
//creating object for class to call non static methods to the main method
		
		obj1.display();// new method of new obj created
		obj1.print();
		// (here obj1 is main method's object and calling display, print from other methods
	}
	
	void display() { //method
		
		int a=20; // local variable
		System.out.println(a);
		// note: inside method only,memory allocated when method starts and de-located when method ends
		System.out.println(b);
		
		
	}
	void print() { // another method
		System.out.println(b);
	}
	
	}
// inside class we can use instance variable as many times but with creating method only
//whatever we write inside the main method only will be executed, not outside the main method


