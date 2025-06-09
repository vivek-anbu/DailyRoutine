class Solution {
    public int jump(int[] nums) {
        
        int jump=0;
        int maxJump=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            max=Math.max(max,i+nums[i]);
            if(max>=nums.length-1)
            {
                jump++;
                break;
            }
            if(i==maxJump)
            {
                maxJump=max;
                jump++;
            }
        }
        return jump;
    }
}
