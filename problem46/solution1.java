class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();
        for(char it:s.toCharArray())
        {
            if(it=='('||it=='{'||it=='[')
            {
                st.push(it);
            } 
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char c=st.pop();
                if(c=='('&&it==')'||c=='{'&&it=='}'||c=='['&&it==']')
                {
                    continue;
                }else
                {
                    return false;
                }
            }           
        }
        return st.isEmpty();
    }
}
