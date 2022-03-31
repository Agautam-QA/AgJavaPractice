
public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		System.out.println(a/0);//Arithmentic exception
       
		String s=null;
		System.out.println(s.length());// NullPointer Eception
	
		String st="12345";//String st="abcde"
		int i=Integer.parseInt(st);// numberformat exception
		System.out.println(i);
		
		int a[]=new int[5];// ArraysIndex out of bound exception
		arr[10]=100;// should have 5 but forcefully 10 here
		
	
	
	
	}
	
	

}
