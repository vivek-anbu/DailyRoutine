class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                if(!st.isEmpty())
                {
                    sb.append(c);
                }
                st.push(c);
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                {
                    sb.append(c);
                }

            }
        }
        return sb.toString();
    }
}
