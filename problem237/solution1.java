class Solution {
    public boolean canJump(int[] nums) {
          
          int stepsLeft=nums[0];
          for(int i=0;i<nums.length;i++)
          {
            if(stepsLeft<0)
            {
                return false;
            }
            if(stepsLeft==nums.length-1)
            {
                return true;
            }
            if(stepsLeft<nums[i])
            {
                stepsLeft=nums[i];
            }
            stepsLeft--;

          }
          return true;
    }
}
