class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null)
        {
            return "";
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        String ans="";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<Math.min(first.length(),last.length());i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
        
    }
}
