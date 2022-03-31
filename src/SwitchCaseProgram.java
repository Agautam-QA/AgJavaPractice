
public class SwitchCaseProgram {

	public static void main(String[] args) {
		// there are 2 ways to do 
		// example 1:
		
		int a=20;
		int b=40;
		int option=5;
	    switch(option) {	 //switch(key){
		 case 1:{  //case value:{
			 
		int c=a+b;	//yield type;
	System.out.println(c);
	break;
	//case 1 is addition, result comes 60
	
	}
		 case 2:{	 //case value:{
			 int c=a-b;	//yield type;
				System.out.println(c);
				break;
				//case 2 comes as -20 after changing "int option=2"
		
		//yield type;
	} 
		 case 3:{		 //case value:{
			 
		
			 int c=a*b;	//yield type;
				System.out.println(c);
				break;//yield type;
				//case 3 comes as 800 after passing option & changing "int option=3"
				
	}
		 case 4:{    //case value:{
			 int c=a/b;	  //yield type;
				System.out.println(c);
				break;
  //case 4 comes as 0 remainder result after passing option & changing "int option=4"
		 }
		default:
			//throw new IlligalArgumentException("Unexpected value: " + kay);
			System.out.println("enter valid option between 1 to 4");
			// this gives result within option 1 to 4 only.....
			//otherwise it says in result"enter valid option bet 1 to 4"
		}

	}

}
