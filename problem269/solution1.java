package inter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem11 {

	public static void main(String[] args) {
		
		String relations[][]={ {"luke","shaw"},
								{"wayne","rooney"},
								{"rooney","ronaldo"},
								{"shaw","rooney"}
		};
		String target="ronaldo";
		Map<String,List<String>> map=new HashMap<>();
		for(int i=0;i<relations.length;i++)
		{
				String child=relations[i][0];
				String father=relations[i][1];
				
				if(!map.containsKey(father))
				{
					map.put(father, new ArrayList<>());
				}
				
				map.get(father).add(child);
			
		}
		int grandChildrenCount=0;
		
		List<String> children=map.get(target);
		if(children!=null)
		{
			for(String str:children)
			{
				List<String> grandChildren=map.get(str);
				grandChildrenCount+=grandChildren.size();
				
			}
		}
		System.out.println("GrandChild Of Ronaldo :"+grandChildrenCount);
	}
	

}
