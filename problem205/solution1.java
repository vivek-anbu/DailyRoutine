// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        
        Stack<String> st=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--)
        {
            char c=pre_exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                st.push(String.valueOf(c));
            }
            else
            {
                String t1=st.pop();
                String t2=st.pop();
                st.push("("+t1+c+t2+")");
            }
        }
        return st.pop();
        
    }
}
