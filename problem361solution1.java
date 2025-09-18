package inter;

import java.util.ArrayList;
import java.util.List;

public class IntegerToString {

	public static void main(String[] args) {
		
		String s="11112";
		List<String>results=new ArrayList<>();
		decode(s,"",results);
		for(String ans:results)
		{
			System.out.println(ans);
		}
		
		
	}
	public static void decode(String s,String current,List<String> results)
	{
		
		if(s.length()==0)
		{
			results.add(current);
			return ;
		}
		int oneDigit=Integer.parseInt(s.substring(0,1));
		if(oneDigit>=1&&oneDigit<=26)
		{
			decode(s.substring(1),current+(char)('A'+oneDigit-1),results);
		}
		if(s.length()>=2)
		{
			int twoDigit=Integer.parseInt(s.substring(0,2));
			decode(s.substring(2),current+(char)('A'+twoDigit-1),results);
		}
		
	}
}
