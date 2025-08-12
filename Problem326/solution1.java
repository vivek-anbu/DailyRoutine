package inter;

import java.util.Collections;

public class Problem66 {

	public static void main(String[] args) {
		
		String a= "1010";
		String b="11001"; 
		
		String s=baseSum(a,b,2);
		System.out.println("Sum :"+s);
		
		String a2 = "123";
        String b2 = "13";
        int n=4;
        String s1=baseSum(a2,b2,n);
        System.out.println("Sum :"+s1);
	}
	public static String baseSum(String a,String b,int base)
	{
		int i=a.length()-1;
		int j=b.length()-1;
		
		StringBuilder sb=new StringBuilder();
		int carry=0;
		while(i>=0||j>=0||carry>0)
		{
			int digit1=(i>=0)?(a.charAt(i)-'0'):0;
			int digit2=(j>=0)?(b.charAt(j)-'0'):0;
			
			int sum=digit1+digit2+carry;
			sb.append(sum%base);
			carry=sum/base;
			i--;
			j--;
		}
			
			sb.reverse();
			return sb.toString();

	}

}
