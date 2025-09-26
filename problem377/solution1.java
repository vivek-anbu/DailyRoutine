package inter;

import java.util.HashMap;
import java.util.Map;

public class FindoccuranceOfElement {

	public static void main(String[] args) {
		
		int a[]= {2,1,3,2,2,5,8,9,8};
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i],map.getOrDefault(a[i], 0)+1);
		}
		System.out.println("Elements With its Occurence:");
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			int key=entry.getKey();
			int values=entry.getValue();
			System.out.println(key+"-"+values);
		}

	}

}
