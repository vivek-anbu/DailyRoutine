public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        
        if(a.length==1)
        {
            return a.length;
        }
        if(k==0)
        {
            return 0;
        }
        int maxCount=0;
        for(int i=0;i<a.length;i++)
        {   int sum=0;
            int count=0;
            for(int j=i;j<a.length;j++)
            {
                sum=sum+a[j];
                count++;
                if(sum==k)
                {
                    maxCount=Math.max(count,maxCount);
                }
            }
        }
        return maxCount;
    }
}
