package inter;

public class Problem20 {

	public static void main(String[] args) {
		
		//String s1="test123string";
		//String s2="123";
	 String s1= "testing12";
	       String s2="1234" ;
		System.out.println("String1: "+s1+","+" String2 "+s2);
		System.out.println("Index of SubString :"+findIndex(s1,s2));
	}
	
	public static int findIndex(String s1,String s2)
	{
		int len1=s1.length();
		int len2=s2.length();
		for(int i=0;i<len1-len2;i++)
		{	
			int j;
			for(j=0;j<len2;j++)
			{
				if(s1.charAt(i+j)!=s2.charAt(j))
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
