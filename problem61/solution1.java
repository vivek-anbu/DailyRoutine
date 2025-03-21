class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character>st=new Stack<>();
        int left=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                st.push(c);
            }
            else if(!st.isEmpty())
            {
                st.pop();
            }
            else
            {
                left++;
            }
        }
        return left+st.size();
    }
}
