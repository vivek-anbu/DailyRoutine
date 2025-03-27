class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=Math.min(1,s.length());
        Set<Character> set=new HashSet<>();
        while(end<s.length())
        {
            char c=s.charAt(end);
            while(set.contains(c))
            {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            int windowSize=end-start+1;
            max= Math.max(max,windowSize);
            end++;
        }
        return max;

    }
}
