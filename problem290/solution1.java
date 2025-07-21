package inter;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		generatePattern(n);

	}
	public static void generatePattern(int n)
	{
			String s="1";
			System.out.println(s);
			for(int i=1;i<n;i++)
			{
				StringBuilder next=new StringBuilder();
				int count=1;
				for(int j=1;j<s.length();j++) {
				
				if(s.charAt(j)==s.charAt(j-1))
				{
					count++;
				}
				else
				{
					next.append(count).append(" ").append(s.charAt(j-1)).append(" ");
					count=1;
				}
				}
				next.append(count).append(" ").append(s.charAt(s.length()-1));
				System.out.println(next.toString());
				s=next.toString().replace(" ","");
			}
	}
	

}
