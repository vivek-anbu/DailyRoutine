class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return niceSub(nums,k)-niceSub(nums,k-1);
    }
    public int niceSub(int nums[],int k){
        int s=0;
        int ans=0;
        for(int i=0,j=0;j<nums.length;j++)
        {
            s=s+nums[j]%2;
            while(s>k)
            {
                s=s-nums[i]%2;
                i++;
            }
            ans=ans+(j-i+1);
        }
        return ans;
    }
}
