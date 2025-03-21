class Solution {
    public int minAddToMakeValid(String s) {
        
        int right=0;
        int left=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                right++;
            }
            else if(right>0&&c==')')
            {
                right--;
            }
            else
            {
                left++;
            }
        
        }
        return right+left;
    } 
}
