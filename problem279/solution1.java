package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem22 {

	public static void main(String[] args) {
		
		String s[]= "One,Two,Three".split(",");
		System.out.println("Reverse String:");
		for(String s1:Problem22.reverseString(s))
		{
			System.out.print(s1+" ");
		}

	}
	public static String[] reverseString(String s[])
	{
	
		List<String> list=new ArrayList<>();
		for(int i=0;i<s.length;i++)
		{
			list.add(s[i]);
			
		}
		Collections.reverse(list);
		return list.toArray(new String[list.size()]);
	}

}
