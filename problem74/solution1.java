class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int n=nums.length;
        int cnt[]=new int[n+1];
        cnt[0]=1;
        int t=0;
        int ans=0;
        for(int num:nums)
        {
            t=t+(num&1);
            if(t-k>=0)
            {
                ans=ans+cnt[t-k];
            }
            cnt[t]++;
        }
        return ans;
    }
}
