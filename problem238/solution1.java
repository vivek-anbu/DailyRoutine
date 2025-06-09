class Solution {
    public int jump(int[] nums) {
        
        int jump=0;
        int curStart=0;
        int curEnd=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(i+nums[i]>curStart)
            {
                curStart=i+nums[i];
            }
            if(i==curEnd)
            {
                jump++;
                curEnd=curStart;
                if(curEnd>=nums.length-1)
                {
                    return jump;
                }
            }
        }
        return jump;
    }
}
