class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return  countSub(nums,goal)- countSub(nums,goal-1); 
    }
    public int countSub(int nums[],int goal)
    {
        int sum=0;
        int count=0;
        int l=0,r=0;
        for(int num:nums)
        {
            sum=sum+num;
            while(sum>goal&&l<=r)
            {
                sum=sum-nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
            
        }
        return count;
    }

}
