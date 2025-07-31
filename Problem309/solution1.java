package inter;

public class Problem27 {

	public static void main(String[] args) {

		int n=5;
		Problem27.generate(n); 

	}
	public static void generate(int n)
	{
		
		String current="1";
		
		System.out.println(current);
		for(int i=1;i<n;i++)
		{
			StringBuilder next=new StringBuilder();
			int count=1;
			for(int j=1;j<current.length();j++)
			{
				if(current.charAt(j)==current.charAt(j-1))
				{
					count++;
				}
				else
				{
					next.append(count).append(" ").append(current.charAt(j-1)).append(" ");
					count=1;
				}
			}
			next.append(count).append(" ").append(current.charAt(current.length()-1)).append(" ");
			System.out.println(next.toString());
			current=next.toString().replace(" ","");
		}
			
	}

}
