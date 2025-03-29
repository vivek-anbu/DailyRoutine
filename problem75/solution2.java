class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

     return countSub(nums,goal)-countSub(nums,goal-1);

    }

      public int countSub(int []nums,int goal)
    {    int r=0;
        int l=0;
        int count=0;
        int sum=0;
        while(r<nums.length)
        {
            sum=sum+nums[r];
            while(sum>goal&&l<=r)
            {
                sum-=nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    
    }
}
