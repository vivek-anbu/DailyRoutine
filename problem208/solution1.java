// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
       
       Stack<String> st=new Stack<>();
       for(int i=0;i<exp.length();i++)
       {
           char c=exp.charAt(i);
           if(Character.isLetterOrDigit(c))
           {
               st.push(String.valueOf(c));
           }
           else
           {
               String t1=st.pop();
               String t2=st.pop();
               st.push("("+t2+c+t1+")");
           }
       }
       return st.pop();
        
    }
}
