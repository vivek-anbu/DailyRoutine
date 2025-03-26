class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==0||nums==null)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int hash[]=new int[max+1];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if((hash[nums[i]])==1)
            {
                return nums[i];
            }
        }
        return 0;
    }
}
