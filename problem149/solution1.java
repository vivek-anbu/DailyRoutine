class Solution {
    public int upperBound(int[] nums, int x) {
  
        int start=0;
        int end=nums.length-1;
        int upperBound=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]>x)
            {
                upperBound=Math.min(upperBound,mid);
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return upperBound;
    }
}
