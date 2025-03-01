class Solution {
    public String reverseWords(String s) {
        
        String words[]=s.trim().split("\\s+");
        String out=" ";
        for(int i=words.length-1;i>=0;i--)
        {
            out=out+words[i]+" ";
        }
        return out.trim();
    }
}
