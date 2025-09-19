package inter;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=in.nextInt();
		int cube=(int) Math.pow(num,3);
		int digits=String.valueOf(num).length();
		int lastDigit=(int) (cube%Math.pow(10, digits));
		if(num==lastDigit)
		{
			System.out.println(num+" is magic Number(Last digit of cube ends with same number).");
		}
		else
		{
			System.out.println(num+" is Not a Magic number");
		}

	}

}
