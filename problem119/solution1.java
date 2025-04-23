class Solution {
    public int[] quickSort(int[] nums) {

        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        int pivot=nums[mid];
        while(start<=end)
        {
            while(nums[start]<pivot)
            {
                start++;
            }
            while(nums[end]>pivot)
            {
                end--;
            }
            if(start<=end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        return nums;
    }
}
