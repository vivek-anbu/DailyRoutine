//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int priority(char c)
    {
        if(c=='+'||c=='-') return 1;
        if(c=='*'||c=='/') return 2;
        if(c=='^') return 3;
        return -1;
    }
    public static String infixToPostfix(String s) {
        
        Stack<Character> st=new Stack<>();
        StringBuffer ans=new StringBuffer();
        for(char c:s.toCharArray())
        {
            if(c>='A'&&c<='Z'||c>='0'&&c<='9'||c>='a'&&c<='z')
            {
                ans.append(c);
            }
            else if(c=='(')
            {
                st.push(c);
            }
            else if(c==')')
            {
                while(!st.isEmpty()&&st.peek()!='(')
                {
                    ans.append(st.pop());
                }
                st.pop();
            }
            else 
            {
                while(!st.isEmpty()&&priority(c)<=priority(st.peek()))
                {
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
            while(!st.isEmpty())
            {
                ans.append(st.pop());
            }
        
        return ans.toString();
        
    }

}
