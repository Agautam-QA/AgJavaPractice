
public class PyramidPatternStar {

	public static void main(String[] args) {
		// Rows=5, columns=5...stars: r1-1,r2-2,r3-3,r4-4,r5-5
		int totalRow=5;
		for(int row=1;row<=totalRow;row++) {
		for(int st=1;st<=row;st++) { //st incrementing row /(st=row)
				System.out.print("*");	
			}
			System.out.println();
			
			// next reverse pyramid
			//for(int row=1;row<=totalRow;row++) {
				//for(int st=1;st<=totalRow-row+1;st++) {
					//System.out.print("*");
				//}
				//System.out.println();
			//}
			
			// for space uses we follow below rules
			//	//for(int sp=1;sp<=totalRow-row;sp++) {// for space
			// totalrow 5,st=row(totalrow-row:5-1=4sp
			//System.out.print(" ");
		}
}
}
	



