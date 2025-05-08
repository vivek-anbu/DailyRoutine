class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char ch=t.charAt(i);
            if(map.containsKey(c))
            {
                if(map.get(c).equals(ch))
                {
                    continue;
                }
                else
                return false;
            }
            else
            {
                if(map.containsValue(ch))
                {
                    return false;
                }
                map.put(c,ch);
            }
        }
        return true;
    }
}
