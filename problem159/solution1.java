class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

       int start=1;
       int end=0;
       for(int i:nums)
       {
        end=Math.max(end,i);
       } 
       while(start<=end)
       {
            int mid=(start+end)/2;
            int sum=0;
           for(int i=0;i<nums.length;i++)
           {
            sum=sum+(int )Math.ceil((double)nums[i]/(double)mid);
           }
            if(sum>threshold)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
       }
       return start;
    }
}
