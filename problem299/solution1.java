package inter;

public class Problem37 {

	public static void main(String[] args) {
		
		//String s=" (a+b)(a*b)";
		String s="(ab)(ab+)";
		//String s="((a+b)";
		
		if(!valid(s))
		{
			System.out.println("Not Valid");
		}
		else
		{
			System.out.println("Valid");
		}

	}
	public static boolean valid(String s)
	{
		String operators="+,-,*,%";
		int open=0;
		for(int i=0;i<s.length();i++)	
		{
			char c=s.charAt(i);
			if(c=='(')
			{
				open++;
			}
			else if(c==')')
			{
				open--;
			}
		}
		if (open>0) return false;
		for(int i=0;i<s.length();i++)
		{	
			char c=s.charAt(i);
			if(operators.indexOf(c)!=-1)
			{
				if(i==0||i==s.length()-1)
				{
					return false;
				}
				char prev=s.charAt(i-1);
				char next=s.charAt(i+1);
				if(next==')'||prev=='('||operators.indexOf(prev)!=-1||operators.indexOf(next)!=-1)
				{
					return false;
				}
				
			}
		}
		return true;
	}

}
