class Solution {
    public boolean checkValidString(String s) {
        
        int n=s.length();
        int opencount=0;
        for(char c:s.toCharArray())
        {   
            if(c=='('||c=='*')
            {
                opencount++;
            }
            else
            {
                opencount--;
            }
            if(opencount<0)
            {
                return false;
            }
        }
        int closecount=0;

        for(int i=n-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c==')'||c=='*')
            {
                closecount++;
            }
            else
            {
                closecount--;
            }
            if(closecount<0)
            {
                return false;
            }
        }
        return true;
    }
}
