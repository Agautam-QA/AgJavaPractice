
public class Employee {
	//class,method object
	// class contains variables and method
	//variables
int eid;
String ename;
double sal;
int deptno;
String job;

// methods
void display() {
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(sal);
	System.out.println(deptno);
	System.out.println(job);
}
// to execute above class we need main method below:
	public static void main(String[] args) {
		// need to create object and call method
		// object 1:
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="john";
		emp1.sal=8000;
		emp1.deptno=35;
		emp1.job="Manager";
		emp1.display();
		
		// object 2:
		Employee emp2=new Employee();
		emp2.eid=505;
		emp2.ename="David";
		emp2.sal=5;
		emp2.deptno=40;
		emp2.job="Cashier";
		emp2.display();
		
	

	}

}
