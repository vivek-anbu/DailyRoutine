class Solution {
    public int numberOfSubstrings(String s) {
        
        int left=0;
        int ans=0;
        int cnt[]=new int[3];
        
        for(int right=0;right<s.length();right++)
        {
            cnt[s.charAt(right)-'a']++;
            while(cnt[0]>0&&cnt[1]>0&&cnt[2]>0)
            {
                ans=ans+s.length()-right;
                cnt[s.charAt(left)-'a']--;
                left++;
            }

        }
        return ans;

    }
}
