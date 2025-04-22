class Solution {
    public int maxFrequency(int[] nums, int k) {
       Arrays.sort(nums);
       int left=0;
       int right=0;
        long sum=0;
       long maxFreq=0;
       for(left=0,right=0;right<nums.length;right++)
       {
            sum=sum+nums[right];
            while(sum+k<(right-left+1L)*nums[right])
            {
                sum=sum-nums[left];
                left++;
            }
            maxFreq=Math.max(maxFreq,(right-left+1L));

       }

        return (int)maxFreq;
    }
}s
