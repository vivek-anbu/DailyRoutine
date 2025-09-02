package inter;

public class Substring {

	public static void main(String[] args) {
		
		String str1="test123string";
		String str2="123";
		int pos=findSubString(str1,str2);
		System.out.println("First occurance of SubString:"+pos);
	}
	
	public static int findSubString(String str1,String str2)
	{
		int len1=str1.length();
		int len2=str2.length();
		for(int i=0;i<len1;i++)
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
