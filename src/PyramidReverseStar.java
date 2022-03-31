
public class PyramidReverseStar {

	public static void main(String[] args) {
		// logics:how many rows?5
		// create for loops which repeats 5 rounds
		
		//assuming int i=5;// rows
		//assuming int j= space 01234 in each row
		//assuming int k= stars
		for(int i=0;i<5;i++) {
			// now how many spaces are there in each row from beginning=0,1,2,3,4,
			for(int j=0;j<i;j++) {// printing spaces
				System.out.print(" "); // this code to print space
			}
				for(int k=5-i;k>0;k--) {// printing stars
					// k=5-i because stars will be decrementing each row
					System.out.print("* ");// stars
				}
					System.out.println();
				}
					
				}
	
				}
	


		
	


