class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countSub(nums,k)-countSub(nums,k-1);
    }
    public int countSub(int nums[],int k)
    {
        int i=0;
        int j=0;
        int sum=0;
        int ans=0;
        for(int num:nums)
        {
            sum=sum+(num%2);
            while(sum>k)
            {
                sum=sum-nums[i]%2;
                i++;
            }
            ans=ans+(j-i+1);
        }
        return ans;
    }
}
