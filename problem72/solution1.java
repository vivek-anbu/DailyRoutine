class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int i=0;
        int count=0;
        for(int j=0;j<nums.length;j++)
        {   
            if(nums[j]==0)
            {
                if(k>0)
                {
                    k--;
                }
                else
                {
                    while(nums[i]!=0)
                    {
                        i++;
                    }
                    i++;
                }
                
            }
          count=  Math.max(count,j-i+1);

        }
        return count;
    }
}
