
public class ForLoopOddEven {

	public static void main(String[] args) {
		// print odd numbers 1-9
		
		//for(int i=1;i<10;i=i+2){
		//System.out.println(i);	
		// so the result prints all odd numbers only 1 3 5 7 9
		
		//}
		// another way to print odd numbers:
		boolean flg=true;
		for(int i=1;i<10;i++) {
		if (flg) {
			System.out.println(i);
			flg=false;
		}
		else {
			flg=true;
			// so the result prints all odd numbers  1 3 5 7 9
		}
		}

	}

}
