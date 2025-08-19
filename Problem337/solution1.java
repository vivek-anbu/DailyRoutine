package inter;

public class Problem76 {

	public static void main(String[] args) {
		
		String s="ABC";
		System.out.println("Input :"+s);
		System.out.println("Output :");
		generate(s,"");
	}
	public static void generate(String remaining,String built )
	{
		if(!built.isEmpty())
		{
			System.out.print(built+" " );
		}
		
		for(int i=0;i<remaining.length();i++)
		{
			generate(remaining.substring(0,i)+remaining.substring(i+1),built+remaining.charAt(i));
		}
	}

}
