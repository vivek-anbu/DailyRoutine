public class Solution {
    public static int findKRotation(int []arr){
        
        int start=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[start]<=arr[end])
            {
                if(arr[start]<ans)
                {
                    index=start;
                    ans=arr[start];
                }
                break;
            }
            if(arr[start]<=arr[mid])
            {
                if(arr[start]<ans)
                {
                    index=start;
                    ans=arr[start];
                }
                else
                {
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<ans)
                {
                    index=mid;
                    ans=arr[mid];
                }
                else{
                    end=mid-1;
                }
            }

        }

        return index;

    }
}
