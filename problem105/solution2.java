class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int s1=word1.length();
        int s2=word2.length();
        char str[]=new char[s1+s2];
        int i=0,j=0,k=0;
        while(i<word1.length()&&j<word2.length())
        {
            str[k++]=word1.charAt(i);
            str[k++]=word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length())
        {
            str[k++]=word1.charAt(i);
            i++;
        }
        while(j<word2.length())
        {
            str[k++]=word2.charAt(j);
            j++;
        }
        for(i=0;i<str.length;i++)
        {
            s.append(str[i]);
        }
        return s.toString(); 
    }
}
