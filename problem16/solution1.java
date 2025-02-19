public class Solution {
    public static int lowerBound(int []arr, int n, int x) {

     int start=0;
     int end=n-1;
     int ans=n;

        while(start<=end)
        {
            int mid= (start+end)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                end=end-1;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return ans;

    }   
    
}
