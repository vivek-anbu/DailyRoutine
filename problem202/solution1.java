class Solution {
    public boolean isValid(String s) {
        
        Map<Character,Character> map=new HashMap<>();
        Stack<Character> st= new Stack<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(char c:s.toCharArray())
        {
            if(map.containsValue(c))
            {
                st.push(c);
            }
            else if(map.containsKey(c))
            {
                if(st.isEmpty()||st.pop()!=map.get(c))
                {
                    return false;
                }
            }

        }
        return st.isEmpty();
    }
}
