package inter;

import java.util.Scanner;

public class NumberToPossibleComAlpha {

	static String mapping[]= {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"}; 
	
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number:");
		String digits=in.next();
		generateCombination(digits,0,"");
	}
	public static void generateCombination(String digits,int index,String current)
	{
		if(index==digits.length())
		{
			System.out.println(current);
			return;
		}
		
		String letters=mapping[digits.charAt(index)-'0'];
		for(char c:letters.toCharArray())
		{
			generateCombination(digits,index+1,current+c);
		}
	}
	

}
