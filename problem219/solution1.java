class Solution {
    public int characterReplacement(String s, int k) {

       int i=0;
       int maxFreq=0;
       int maxLen=0;
       int freq[]=new int[26];
       for(int j=0;j<s.length();j++)
       {
            char c=s.charAt(j);
            freq[c-'A']++;
            maxFreq=Math.max(maxFreq,freq[c-'A']);
            while(j-i+1-maxFreq>k)
            {
                freq[s.charAt(i)-'A']--;
                i++;
            }

            maxLen=Math.max(maxLen,j-i+1);
       } 
       return maxLen;
    }
}
