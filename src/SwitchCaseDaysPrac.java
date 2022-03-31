
public class SwitchCaseDaysPrac {

	public static void main(String[] args) {
		// task: write weekend

		int day = 6; // i initialize value
	    switch(day) {	 //switch(key){
		 case 1:{  //case value:{
			 System.out.println("Monday");
	         break;
	    }
		     case 2:{	 
			 
				System.out.println("Tuesday");
				break;
				} 
		     
		     case 3:{		
			 System.out.println("Wednesday");
			 break;
		 
			}
		    case 4:{   
				System.out.println("Thursday");
				break;
 
		 }
		    case 5:{   
				System.out.println("Friday");
				break;
 
		 }
		    case 6:{   
				System.out.println("Saturday");
				break;
 
		 }
		    case 7:{   
				System.out.println("Sunday");
				break;
				
				// we use "break" to end the process
 
		 }
		default: // optional
			System.out.println("Enter the valid value fron 1 to 7:");
			
		}

	}




	}


