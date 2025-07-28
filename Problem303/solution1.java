package inter;

public class Problem41 {

	public static void main(String[] args) {
		
		String str1="test123string";
		String str2="123";
		System.out.println("Occrance of String "+findOccurance(str1,str2));

	}
	public static int findOccurance(String str1,String str2)
	{
		int len1=str1.length();
		int len2=str2.length();
		for(int i=0;i<len1-len2;i++)
		{
			int j=0;
			for(j=0;j<len2;j++)
			{
				if(str1.charAt(i+j)!=str2.charAt(j))
				{
					break;
				}
			}
			if(len2==j)
			{
				return i;
			}
		}
		return -1;
		
	}

}

