class Solution {
    public int maxFrequency(int[] nums, int k) {
       Arrays.sort(nums);
        int left=0;
       int right=0;
       long sum=0,maxFreq=0;
       while(right<nums.length)
       {
            sum=sum+nums[right];
            while(sum+k<(right-left+1L)*nums[right])
            {
                sum=sum-nums[left];
                left++;
            }
            maxFreq=Math.max(maxFreq,(right-left+1L));
            right++;
       } 
       return maxFreq;
    }
}
