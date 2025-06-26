package inter;

public class Problem16 {

	public static void main(String[] args) {
		
		String s1="(a+b)(a*b)";
		String s2="(ab)(ab+)";
		String s3="((a+b)";
		System.out.println("String is Valid or NotValid :"+ (isValid(s1) ? "valid":"Not Valid"));
		System.out.println("String is Valid or Not valid :"+ (isValid(s2) ?"Valid" :"Not Valid"));

	}
	public static boolean isValid(String s)
	{
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
		if(open>0) return false;
		String operators="+-*/";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(operators.indexOf(c)!=-1)
			{
				if(i==0||i==s.length()-1) return false;
				
				char prev=s.charAt(i-1);
				char next=s.charAt(i+1);
				if(prev=='('||next==')'||operators.indexOf(prev)!=-1||operators.indexOf(next)!=-1)
				{
					return false;
				}
			}
		}
		return true;
	}

}
