class Solution {
    public boolean canJump(int[] nums) {
        
        int stepsleft=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            stepsleft--;
            if(stepsleft<0)
            {
                return false;
            }
            if(stepsleft==nums.length-1)
            {
                return true;
            }
            if(stepsleft<nums[i])
            {
                stepsleft=nums[i];
            }
        }
        return true;
    }
}
