class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length==1||k==nums.length)
        {
            return ;
        }
        if(k>nums.length)
        {
            k=k%nums.length;
        }
        int left=0;
        int right=nums.length-1-k;
        int nextLeft=right+1;
        while(left<right)
        {
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
            
        }
         right=nums.length-1;
        while(nextLeft<right)
        {
            int temp=nums[right];
            nums[right]=nums[nextLeft];
            nums[nextLeft]=temp;
            nextLeft++;
            right--;
        }
        left=0;
        right=nums.length-1;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
