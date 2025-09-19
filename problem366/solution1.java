package inter;

import java.util.Scanner;

public class RemoveZeroCheck {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1=in.nextInt();
		System.out.println("Enter Number2:");
		int num2=in.nextInt();
		System.out.println("Enter Operation:");
		char op=in.next().charAt(0);
		
		int result1=(op=='+')?(num1+num2):(num1-num2);
		
		int num1NoZero=removeZero(num1);
		int num2NoZero=removeZero(num2);
		int result2=(op=='+')?(num1NoZero+num2NoZero):(num1NoZero-num2NoZero);
		
		int result1NoZero=removeZero(result1);
		if(result1NoZero==result2)
		{
			System.out.println("Yes-Both are Same");
		}
		else
		{
			System.out.println("No -there is Some different");
		}
		
	}
	public static int removeZero(int num)
	{
		String s=String.valueOf(num).replace("0", "");
		if(s.isEmpty())
		{
			return 0;
		}
		return Integer.parseInt(s);
		
	}

}
