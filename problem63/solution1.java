
// User function Template for Java

class Solution {
    public int findMatching(String text, String pat) {
        
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)==pat.charAt(0))
            {
                int j=0;
               int k=i;
               while(j<pat.length()&&k<text.length()&&
               text.charAt(k)==pat.charAt(j)){ 
               k++;
                j++;
                if(j==pat.length())
                {
                    return i;
                }
               }
            }
        }
        return -1;
    }
}
