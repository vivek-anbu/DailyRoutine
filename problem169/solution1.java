class Solution {
    public int maxDepth(String s) {
        
        int max=0;
        int cn=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                cn++;
            }
            else if(c==')')
            {
                cn--;
            }
            max=Math.max(cn,max);
        }
        return max;
    }
}
