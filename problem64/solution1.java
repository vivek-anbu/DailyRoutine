 class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

       int left=1,right=0;
       for(int i:nums)
       {
            right=Math.max(i,right);
       } 
       while(left<right)
       {
           
            int mid=(left+right)/2;
             int sum=0;
            for(int i:nums)
            {   
                sum=sum+((i+mid-1)/mid);
            } 
            if(sum>threshold)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
       }
       return left;
    }
}
