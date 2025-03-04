class Solution {
    public String frequencySort(String s) {

    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {   
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
    }        
    PriorityQueue<Character> q=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));

    for(char ch:map.keySet())
    {
        q.add(ch);
    }
    StringBuilder sb=new StringBuilder();
    while(q.size()>0)
    {
        char c=q.poll();
        for(int i=0;i<map.get(c);i++)
        {
            sb.append(c);
        }

    }
    return sb.toString();
    }
}
