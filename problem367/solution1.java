package inter;

import java.util.Scanner;

public class CyclicNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=in.nextInt();
		
		String originalStr=String.valueOf(n);
		String doubleStr=originalStr+originalStr;
		boolean isCyclic=true;
		for(int i=2;i<originalStr.length();i++)
		{
			int product=n*i;
			String prdStr=String.valueOf(product);
			if(!doubleStr.contains(prdStr))
			{
				isCyclic=false;
				break;
			}
			
		}
		if(isCyclic==true)
		{
			System.out.println(n+" is cyclic Number");
		}
		else
		{
			System.out.println(n+" is not cyclic number");
		}
		
	}

}
