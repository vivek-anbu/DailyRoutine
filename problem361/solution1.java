package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxPrime {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of Digits:");
		int n=in.nextInt();
		System.out.println("Enter Number:");
		String num=in.next();
		List<Integer> primes=new ArrayList<>();
		generatePermutations(num,"",primes);
		if(primes.size()==0)
		{
			System.out.println("No larger Prime is Found");
		}
		else
		{
			int max=Collections.max(primes);
			System.out.println("Largest Prime is:"+max);
		}
	}
	public static void generatePermutations(String num,String result,List<Integer>primes)
	{
		if(num.length()==0)
		{
			int n=Integer.parseInt(result);
			if(isPrime(n))
			{
				primes.add(n);
			}
			return ;
		}
		for(int i=0;i<num.length();i++)
		{
			generatePermutations(num.substring(0,i)+num.substring(i+1),result+num.charAt(i),primes);
		}
	}
	public static boolean isPrime(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
