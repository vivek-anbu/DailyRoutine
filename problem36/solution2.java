class Solution {
    public boolean rotateString(String s, String goal) {
        
        String st="";
        if(s.length()!=goal.length())
        {
            return false;
        }
        st=s+s;
        return st.contains(goal);

    }
}
