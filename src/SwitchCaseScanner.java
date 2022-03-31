import java.util.Scanner;
public class SwitchCaseScanner {

	public static void main(String[] args) {
		// switch case example 2 with Scanner
		int a=20;
		int b=40;
		
		System.out.println("Enter valid option between 1 to 4:");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();// used this formula to get input from user
		//this scanner formula not for automation but for developer
		
	    switch(option) {	 //switch(key){
		 case 1:{  //case value:{
			 
		int c=a+b;	
	System.out.println(c);
	break;  //yield type;
	//case 1 : if user enter 1 then result comes 60
	
	}
		 case 2:{	 //case value:{
			 int c=a-b;	
				System.out.println(c);
				break;  //yield type;
				//case 2 if user enter 2 then result comes -20"
		
		//yield type;
	} 
		 case 3:{		 //case value:{
			 
		
			 int c=a*b;	//yield type;
				System.out.println(c);
				break;//yield type;
				//case 3 if user enter 3 then result comes 800
				
	}
		 case 4:{    //case value:{
			 int c=a/b;	  //yield type;
				System.out.println(c);
				break;
  //case 4 if user enter 4 then result comes 0 remainder value
		 }
		default:
			//throw new IlligalArgumentException("Unexpected value: " + kay);
			System.out.println("Enter valid option between 1 to 4:");
			// this gives result within option 1 to 4 only.....
			//otherwise it says in result"enter valid option bet 1 to 4"
		}

	}



	}


