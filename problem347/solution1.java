package inter;

public class PrintPatternUsing1 {

	public static void main(String[] args) {
		
		int n=5;
		generatePattern(n);
		
		
	}
	public static void generatePattern(int n)
	{
		
		String current="1";
		System.out.println(current);
		for(int i=1;i<n;i++)
		{
			StringBuilder next=new StringBuilder();
			int count=1;
			for(int j=1;j<current.length();j++) 
			{
			
			 if(current.charAt(j-1)==current.charAt(j))
			 {
				count++;
			 }
			 else
			 {
				next.append(count).append(current.charAt(j-1));
				count=1;
		     }
			}
			next.append(count).append(current.charAt(current.length()-1));
			System.out.println(next.toString());
			current=next.toString();	
		}
	}

}
