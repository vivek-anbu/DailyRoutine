class Solution {
    public int jump(int[] nums) {
        
        int count=0,max=0;
        int tempmax=0;
        for(int i=0;i<nums.length-1;i++)
        {
            
            max=Math.max(max,i+nums[i]);
            if(i==tempmax)
            {
                count++;
                tempmax=max;
            }
        }
        return count;
    }
}
