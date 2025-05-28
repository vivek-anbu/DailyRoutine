class Solution {
    public int lengthOfLongestSubstring(String s) {

       int maxLen=Math.min(1,s.length());
       int start=0;
       int end=0;
       Set<Character> set=new HashSet<>();
       while(end<s.length())
       {
            while(set.contains(s.charAt(end)))
            {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            int windowSize=end-start+1;
            maxLen=Math.max(windowSize,maxLen);
            end++;
       } 
       return maxLen;
    }
}
