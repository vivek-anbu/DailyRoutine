package inter;

public class Problem43 {

	public static void main(String[] args) {
		
		String str="One Two Three";
		System.out.println("Reverse String :"+reverseString(str));
		
	}
	public static String reverseString(String s)
	{
		 int spaceIndex=s.indexOf(' ');
		 if(spaceIndex==-1)
		 {
			 return s;
		 }
		 String first=s.substring(0,spaceIndex);
		 String rest=s.substring(spaceIndex+1);
		 return reverseString(rest)+" "+first;
	}
}
