
// User function Template for Java

class Solution {
    public int findMatching(String text, String pat) {
        
        for(int i=0,j=pat.length();j<=text.length();i++,j++)
        {
            if(text.substring(i,j).equals(pat))
            return i;
        }
        return -1;
    }
}
