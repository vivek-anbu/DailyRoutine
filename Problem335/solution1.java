package inter;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="A man, in the boat says : I see 1-2-3 in the sky";
		System.out.println("Reversed String :");
		char str[]=reverse(s);
		for(char a:str)
		{
			System.out.print(a+"");
		}

	}
	public static char[] reverse(String s)
	{
		int left=0;
		int right=s.length()-1;
		char str[]=s.toCharArray();
		while(left<=right)
		{
			if(!Character.isLetterOrDigit(str[left]))
			{
				left++;
			}
			else if(!Character.isLetterOrDigit(str[right]))
			{
				right--;
			}
			
			char temp=str[left];
			str[left]=str[right];
			str[right]=temp;
			left++;
			right--;
		}
		
		return str;
	}

}
