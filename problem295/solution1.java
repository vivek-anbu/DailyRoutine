package inter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem33 {

	public static void main(String[] args) {
		
		String relations[][]= {{"luke","shaw"},
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
					map.put(father, new ArrayList<String>());
				}
				map.get(father).add(child);
		}
		List<String> children=map.get(target);
		int grandChildrenCount=0;
		if(children!=null) {
		for(String str:children)
		{
			List<String> grandChild=map.get(str);
			grandChildrenCount+=grandChild.size();
		}
		}
		
		System.out.println("Grand Children of " +target+" "+grandChildrenCount);
	}

}
