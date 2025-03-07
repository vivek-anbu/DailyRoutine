class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(char it:s.toCharArray())
        {
            if(map.containsValue(it))
            {
                st.push(it);
            }
            else if(map.containsKey(it))
            {
                if(st.isEmpty()||map.get(it)!=st.pop())
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
