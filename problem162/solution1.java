class Solution {
    public String reverseWords(String s) {
        
        String str[]=s.trim().split("\\s+");
        String st="";
        for(int i=str.length-1;i>=0;i--)
        {
            st=st+str[i]+" ";
        }
        return st.trim();
    }
}
