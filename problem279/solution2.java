package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem22 {

	public static void main(String[] args) {
		
	//	String s[]= "One Two Three".split(" ");
		String str="I Love India";
		System.out.println("Reverse String:"+reverseString(str));
	}
	public static String reverseString(String s)
	{
		
		int spaceIndex=s.indexOf(' ');
		if(spaceIndex==-1)
		{
			return " ";
		}
		String first=s.substring(0,spaceIndex);
		String rest=s.substring(spaceIndex+1);
		
		return reverseString(rest)+" "+first;
	}
	
}
