
public class PyramidStarWithOddNumberValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i=row,j=space,k=stars
		//1 is starting and 5 is number of rows
		for(int i=1;i<=5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(" ");
				}
			for(int k=1;k<(i*2);k++) {//multiply i value by 2 makes skip 2 numbers
			System.out.print("*");	
			}
			System.out.println();
		}

	}

}
