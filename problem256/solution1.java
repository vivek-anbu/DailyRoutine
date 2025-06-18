class Solution {
    public void moveZeroes(int[] nums) {

        int m=0;
        int count=0;
        
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]!=0)
        {
            nums[m++]=nums[i];
        }
        else
        {
            count++;
        }
       }
       while(m<nums.length)
       {
            if(count>0)
            {
                nums[m++]=0;
            }
       }

    }
}
