class Solution {
    public int characterReplacement(String s, int k) {
        
        int i=0;
        int j=0;
        int maxFreq=0;
        int maxLength=0;
        int freq[]=new int [26];
        while(j<s.length())
        {
            char c=s.charAt(j);
            freq[c-'A']++;
            maxFreq=Math.max(maxFreq,freq[c-'A']);
            if(j-i+1-maxFreq>k)
            {
                freq[s.charAt(i)-'A']--;
                i++;
            }
            maxLength=Math.max(maxLength,j-i+1);
            j++;
        }
        return maxLength;
    }
}
