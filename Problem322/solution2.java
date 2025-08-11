package inter;

public class Problem62 {

	public static void main(String[] args) {
		
		
		int num=6;
		int  n=2*num-1;
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 int top=i;
				 int bottom=j;
				 int left=(2*num-2)-i;
				 int right=(2*num-2)-j;
				 
				 System.out.print(num-Math.min(Math.min(top,bottom),Math.min(left,right)));
			 }
			 System.out.println();
		 }
		

	}

}
