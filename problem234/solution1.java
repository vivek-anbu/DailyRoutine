class Solution {
    public boolean checkValidString(String s) {
        
        int minOpened=0;
        int maxOpened=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                minOpened++;
                maxOpened++;
            }
            else if(c==')')
            {
                minOpened--;
                maxOpened--;
            }
            else 
            {
                minOpened--;
                maxOpened++;
            }
            if(minOpened<0)
            {
                minOpened=0;
            }
            if(maxOpened<0)
            {
                return false;
            }
        }
        return minOpened==0;
    }
}
