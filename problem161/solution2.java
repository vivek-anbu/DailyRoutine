class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder str=new StringBuilder();
        int cn=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==')')
            {
                cn--;
            }
            if(cn!=0)
            {
                str.append(c);
            }
            if(c=='(')
            {
                cn++;
            }
        }
        return str.toString();
    }
}
