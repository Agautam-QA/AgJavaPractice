package StringMethods;

public class BufferBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1=new StringBuffer("Today is Holi,");
		sb1.append(" Let's celebrate!!");
		sb1.replace(0, 0,"Hurray!!!");
		
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("have fun");
		sb2.append(" have a colorful Holi!");
		sb2.replace(0, 8, "Enjoy!!");
		System.out.println(sb2);
		
	}

}
