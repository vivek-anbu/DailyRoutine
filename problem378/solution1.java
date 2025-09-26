package inter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedString {

	public static void main(String[] args) {
		
		String s[]= {"java","java","python","c","java","python"};
		
		Map<String,Integer> map=new HashMap<>();
		for(String str:s)
		{
			map.put(str,map.getOrDefault(str, 0)+1);
		}
		ArrayList<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
		list.sort((a,b)->(b.getValue()-a.getValue()));
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).getKey());
			if(i<list.size()-1)
			{
				System.out.print(",");
			}
		}
		

	}

}
