import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int c:a)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int d:b)
        {
            map.put(d,map.getOrDefault(d,0)+1);
        }
        for(int e:map.keySet())
        {
            list.add(e);
        }
        return list;


    }
}
