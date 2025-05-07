class Solution {
    public String removeOuterParentheses(String s) {
        int cn=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==')')
            {
                cn--;
            }
            if(cn!=0)
            {
                str=str+c;
            }
            if(c=='(')
            {
                cn++;
            }
        }
        return str;
    }
}
