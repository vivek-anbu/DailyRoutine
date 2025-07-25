package inter;

public class Problem38 {

	public static void main(String[] args) {
		
		String s="a1b10";
		System.out.println("Input "+s);
		System.out.println("Output "+convertString(s));
	}
	public static String convertString(String s)
	{
		
		StringBuilder res=new StringBuilder();
		
		int i=0;
		while(i<s.length())
		{
			char c=s.charAt(i);
			i++;
			
			StringBuilder num=new StringBuilder();
			while(i<s.length()&&Character.isDigit(s.charAt(i)))
			{
				num.append(s.charAt(i));
				i++;
			}
			int count=Integer.parseInt(num.toString());
			for(int j=0;j<count;j++)
			{
				res.append(c);
			}
		}
		return res.toString();
	}

}
