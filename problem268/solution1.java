package inter;

public class Problem9 {

	public static void main(String[] args) {
		 
			String str="WELCOMETOZOHOCORPORATION";
			String ogStr[][]=new String[5][5];
			int index=0;
			for(int i=0;i<ogStr.length&&index<str.length();i++)
			{
				for(int j=0;j<ogStr.length&&index<str.length();j++)
				{
					ogStr[i][j]=String.valueOf(str.charAt(index++));
				}
			}
			String word="TOO";
			findSubString(ogStr,word);
	}
	public static void findSubString(String ogStr[][],String word)
	{
		int row=ogStr.length;
		int col=ogStr[0].length;
		int len=word.length();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=col-len;j++)
			{
				int k;
				for(k=0;k<len;k++)
				{
					if(!ogStr[i][j+k].equalsIgnoreCase(String.valueOf(word.charAt(k))))
					{
						break;
					}
				}
				if(k==len)
				{
					System.out.println("StartIndex"+"<"+i+","+j+">"+"EndIndex"+"<"+(i+len-1)+","+j+">");
					return ;
				}
			}
		}
		for(int i=0;i<=row-len;i++)
		{
			for(int j=0;j<col;j++)
			{
				int k;
				for(k=0;k<len;k++)
				{
					if(!ogStr[i+k][j].equalsIgnoreCase(String.valueOf(word.charAt(k))))
					{
						break;
					}
				}
				if(k==len)
				{
					System.out.println("StartIndex"+"<"+i+","+j+">"+ "EndIndex"+"<"+(i+len-1)+","+j+">");
					return ;
				}
			}
		}
		System.out.println("Cannot Find SubString");
			
	}
}
