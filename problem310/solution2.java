package inter;

import java.util.Scanner;

public class Problem48 {

	public static void main(String[] args) {
		
		 int N=6;
		 int M=7;
		 
		 for(int i=0;i<M;i++)
		 {
			 for(int j=0;j<N;j++)
			 {
				 if(i==0||i==M-1||j==0||j==N-1)
				 {
					System.out.print("X "); 
				 }
				 else if(i==1||i==M-2||j==1||j==N-2)
				 {
					 System.out.print("0 ");
				 }
				 else
				 {
					 System.out.print("X ");
				 }
			 }
			 System.out.println();
		 }
		 
	    }
	
	}
