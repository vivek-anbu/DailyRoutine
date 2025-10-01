package coreBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurencePos {

	public static void main(String[] args) {
		
		     String s="Jana Gana Mana ";
		     String str[]=s.split("\\s+");
		     Map<String,List<Integer>> map=new HashMap<>();
		     for(int i=0;i<str.length;i++)
		     {
		    	 String word=str[i];
		    	 if(!map.containsKey(word))
		    	 {
		    		 map.put(word,new ArrayList<>());
		    	 }
		    	 map.get(word).add(i);
		     }
		     for(String key:map.keySet())
		     {
		    	 List<Integer>idx=map.get(key);
		    	 System.out.println(key+" ->Count: "+map.get(key).size()+" Indices:"+idx);
		     }
		     

	}

}
