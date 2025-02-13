import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        
        HashSet<Integer> s=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        for(int i=0;i<n;i++)
        {
            s.add(a[i]);
        }
        for(int j=0;j<m;j++)
        {
            s.add(b[j]);
        }
        for(int it:s)
        {
            list.add(it);
        }
        return list;
    }
}
