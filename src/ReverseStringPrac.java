
public class ReverseStringPrac {

	public static void main(String[] args) {
		// way#1 using +(String Concatenation)operator
		
		String str="ABCD";
		String rev="";
		
		/*int len=str.length();  // 4 characters
		str.charAt(0);
		
		for(int i=len-1;1>=0;i--) {//3 2 1 -1
			rev =rev+str.charAt(i);  //D C B A
		}
	     //System.out.println("Reverse String is: "+rev); */
		
		//way #2 using Character Array
		
		/*char a[]=str.toCharArray();
		int len=a.length;// lenth is 4 here
		for(int i=len-1;i>=0;i--) {// 3 2 1
			rev=rev+a[i];// DCBA
			System.out.println("Reverse String is: "+rev);*/
		
		//way#3 using String Buffer
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.reverse());
			
		}

	}


