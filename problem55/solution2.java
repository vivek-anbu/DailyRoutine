class Solution {
    public int jump(int[] nums) {
        
        int max=0;
        int jump=0;
        int maxJump=0;
        for(int i=0;i<nums.length-1;i++)
        {
            max=Math.max(max,i+nums[i]);
            if(max>=nums.length-1)
            {
                jump++;
                break;
            }
            if(maxJump==i)
            {
                jump++;
                maxJump=max;
            }
        }
        return jump;
    }
}
