class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length())
        {
            return false;
        }
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<st.length();i++)
        {
            if(st.toString().equals(goal))
            {
                return true;
            }
            char ch=st.charAt(0);
            st.deleteCharAt(0);
            st.append(ch);
        }  
        return false;
    }
}
