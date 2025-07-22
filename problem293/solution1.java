package inter;

public class Problem31 {

	public static void main(String[] args) {
		
		String str="WELCOMETOZOHOCORPORATION";
		String ogstr[][]=new String[5][5];
		int index=0;

		for(int i=0;i<ogstr.length&&index<str.length();i++)
		{
			for(int j=0;j<ogstr[0].length&&index<str.length();j++)
			{
				ogstr[i][j]=String.valueOf(str.charAt(index++));
			}
		}
		
		String word="TOO";
		findPos(ogstr,word);

	}
	public static void findPos(String ogstr[][],String word)
	{
		int row=ogstr.length;
		int col=ogstr[0].length;
		int len=word.length();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col-len;j++)
			{
				int k=0;
				for(k=0;k<len;k++)
				{
					if(!ogstr[i][j+k].equalsIgnoreCase(String.valueOf(word.charAt(k))))
					{
						break;
					}
				}
				if(k==len)
				{
					System.out.println("Start Index"+"<"+i+j+">"+","+"End Index"+"<"+(i+len-1)+","+j+">");
					return ;
				}
			}
		}
		
		for(int i=0;i<row-len;i++)
		{
			for(int j=0;j<col;j++)
			{
				int k=0;
				for(k=0;k<len;k++)
				{
					if(!ogstr[i+k][j].equalsIgnoreCase(String.valueOf(word.charAt(k))))
					{
						break;
					}
				}
				if(k==len)
				{
					System.out.println("Start Index"+"<"+i+","+j+">" +","+"End Index"+"<"+(i+len-1)+","+j+">");
					return ;
				}
				
			}
		}
		System.out.println("Cannot Find String ");
	}

}
