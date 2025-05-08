class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char ch=t.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,ch);
            }
            else if(map.containsKey(c)&&map.get(c)!=ch)
            {
                return false; 
            }
            
        }
        return true;
    }
}
