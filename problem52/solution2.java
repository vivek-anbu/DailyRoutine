class Solution {
    public boolean checkValidString(String s) {
        
        int minopened=0;
        int maxopened=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                minopened++;
                maxopened++;
            }
            else if(c==')')
            {
                minopened--;
                maxopened--;
            }
            else
            {
                minopened--;
                maxopened++;
            }
            if(minopened<0)
            {
                minopened=0;
            }
            if(maxopened<0)
            {
                    return false;
            }
        }


        return minopened==0;
    }
}
