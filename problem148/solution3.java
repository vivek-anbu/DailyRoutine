public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        
        int start=0;
        int end=n-1;
        int lowerBound=n;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>=x)
            {
                lowerBound=Math.min(lowerBound,mid);
                end=mid-1;
            }
            else 
            {
                start=mid+1;
            }
        }
        return lowerBound;
    }
}
