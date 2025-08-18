package inter;

public class Problem75 {

	public static void main(String[] args) {
		int nums[]= {1,26,27,676};
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]+"->" + convertAlphabet(nums[i]));
		}

	}
	public static String convertAlphabet(int n)
	{
		StringBuilder sb=new StringBuilder();

		while(n>0)
		{
			int rem=n%26;
			if(rem==0)
			{
				sb.append('Z');
				n=n/26-1;
			}
			else
			{
				sb.append((char)('A'+rem-1));
				n=n/26;
			}
		}
		
		return sb.reverse().toString();
	}

}
