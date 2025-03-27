class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int right=0;
        int max=Math.min(1,s.length());
        Set<Character> set=new HashSet<>();
        for(right=0;right<s.length();right++)
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                int windowSize=right-left+1;
                max=Math.max(max,windowSize);
            }
            else
                {
                    while(set.contains(s.charAt(right)))
                    {
                        set.remove(s.charAt(left));
                        left++;
                    }
                    set.add(s.charAt(right));
                }

        }   
        return max;
    }
}
