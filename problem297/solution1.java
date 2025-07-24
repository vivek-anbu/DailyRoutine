package inter;

public class Problem35 {

		public static void main(String args[])
		{
			String str="((abc)((de))";
			
			System.out.println("Input:"+str);
			
			System.out.println("Ouput:"+removeUnbalanced(str));
		}
		public static String removeUnbalanced(String str)
		{
			if(str.isEmpty()||str==null)
			{
				return " "; 
			}
			StringBuilder sb=new StringBuilder();
			int open=0;
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				if(c=='(')
				{
					open++;
					sb.append(c);
				}
				else if(c==')')
				{
					if(open>0)
					{
						sb.append(c);
						open--;
					}
				}
				else
				{
					sb.append(c);
				}
			}
			int extraOpen=open;
			StringBuilder s=new StringBuilder();
			for(int i=sb.length()-1;i>=0;i--)
			{
				char c=sb.charAt(i);
				if(c=='('&&extraOpen>0)
				{
					extraOpen--;
					continue;
				}
				s.insert(0, c);
			}
			return s.toString();
			
		}
}
