class Solution {
    public String reverseWords(String s) {
        
        String a[]=s.split(" +");
        String st="";
        for(int i=a.length-1;i>=0;i--)
        {
            st=st+a[i]+" ";
        }
        return st.trim();
     }
}
