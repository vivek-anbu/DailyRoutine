class Solution {
    public boolean checkValidString(String s) {

     int openCount=0;
     for(char c:s.toCharArray())
     {
        if(c=='('||c=='*')
        {
            openCount++;
        }
        else
        {
            openCount--;
        }
        if(openCount<0)
        {
            return false;
        }
     }   
     int closeCount=0;
    int n=s.length()-1;
     for(int i=n;i>=0;i--)
     {
        char ch=s.charAt(i);
        if(ch==')'||ch=='*')
        {
            closeCount++;
        }
        else
        {
            closeCount--;
        }
        if(closeCount<0)
        {
            return false;
        }
     }
    return true;
    }
}
