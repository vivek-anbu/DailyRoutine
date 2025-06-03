package inter;
class Solution3
{
	public String zigZag(String s,int n)
	{
		if(s.length()<n||n==1)
		{
			return s;
		}
		String rows[]=new String[n];
		for(int i=0;i<n;i++)
		{
			rows[i]="";
		}
		int row=0;
		boolean down=true;
		for(int i=0;i<s.length();i++)
		{
			rows[row]+=s.charAt(i);
			if(row==0)
			{
				down=true;
			}
			else if(row==n-1)
			{
				down=false;
			}
			row=row+(down?1:-1);
		}
		StringBuilder sb=new StringBuilder();
		for(String c:rows)
		{
			sb.append(c);
		}
		return sb.toString();
	}
	
}

public class Problem3 {

	public static void main(String[] args) {
		
		//String s = "ZSGRADUATESTUDIES";
	String s="ZSGRADUATESTUDIES";
		int n=4;
	//	String s="A";
		//int n=1;
		Solution3 sol=new Solution3();
		System.out.println(sol.zigZag(s,n));
	
		
	}
}
