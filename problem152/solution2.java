public class Solution {
    public static int count(int arr[], int n, int x) {
       
       int first=searchFirst(arr,n,x);
       int last=searchLast(arr,n,x);
       if(first==-1)
       {
           return 0;
       }
        return last-first+1;
    }
    public static int searchFirst(int arr[],int n,int x)
    {
        int first=-1;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==x)
            {
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]>=x)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return first;
    }
    public static int searchLast(int arr[],int n,int x)
    {
        int last=-1;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==x)
            {
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]>=x)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return last;
    }
}
