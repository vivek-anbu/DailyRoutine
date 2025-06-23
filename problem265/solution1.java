package inter;
class Solution7
{
	public void pattern(String str,int len)
	{
		for(int i=0;i<len;i++)
		{
			int j=len-1-i;
			for(int k=0;k<len;k++)
			{
				if(k==i||k==j)
				{
					System.out.print(str.charAt(k));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
}
public class Problem7 {

	public static void main(String[] args) {
		
		Solution7 s7=new Solution7();
		//String str="PROGRAM";
		String str="geeksforgeeks";
		int len=str.length();
		s7.pattern(str,len);

	}

}
