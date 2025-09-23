package inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolveExpression {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Expression:");
		String exp=in.nextLine();
		double ans=solveExp(exp);
		System.out.println("Answer:"+ans);
		
	
	}
	public static double solveExp(String exp)
	{
		exp=exp.replaceAll("\\s+", "");
		
		List<Double>numbers=new ArrayList<>();
		List<Character> operators=new ArrayList<>();
		
		StringBuilder num=new StringBuilder();
		for(char c:exp.toCharArray())
		{
			if(Character.isDigit(c)||c=='.')
			{
				num.append(c);
			}else
			{
				numbers.add(Double.parseDouble(num.toString()));
				num.setLength(0);
				operators.add(c);
			}
		}
		numbers.add(Double.parseDouble(num.toString()));
		
		for(int i=0;i<operators.size();)
		{
			char op=operators.get(i);
			if(op=='*'||op=='/')
			{
				double a=numbers.get(i);
				double b=numbers.get(i+1);
				double res=(op=='*')?(a*b):(a/b);
				
				numbers.set(i, res);
				numbers.remove(i+1);
				operators.remove(i);
			}
			else
			{
				i++;
			}
		}
		double res=numbers.get(0);
		for(int i=0;i<operators.size();i++)
		{
			char op=operators.get(i);
			double b=numbers.get(i+1);
			if(op=='+')
			{
				res+=b;
			}else
			{
				res-=b;
			}
		}
		return res;
	}

}
