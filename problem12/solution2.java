class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int m=i;m<=j;m++){
                    sum=sum+nums[m];
                }
                    if(sum==k)
                        count++;
            }
        }

        return count;
    }
}
