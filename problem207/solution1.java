// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
       
        Stack<String> st=new Stack<>();
        
        for(int i=0;i<post_exp.length();i++)
        {
            char c=post_exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                st.push(String.valueOf(c));
            }
            else
            {
                String t1=st.pop();
                String t2=st.pop();
                st.push(c+t2+t1);
            }
        }
        return st.pop();
    }
}

