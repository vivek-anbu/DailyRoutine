class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }
        int longest=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int cn=nums[i];
            int curlen=1;
            while(linearSearch(nums,cn+1)==true)
            {
                cn=cn+1;
                curlen++;
            }
            longest=Math.max(longest,curlen);
        }
        return longest;

    }
    public boolean linearSearch(int nums[],int x)
    {
            int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==x)
            {
                return true;
            }
        }   
        return false;
    }
}
