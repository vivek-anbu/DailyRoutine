public class Solution {
    public static int count(int arr[], int n, int x) {
        
        int first=searchFirst(arr,x,n);
        if(first==-1){
            return 0;
        }
        int last=searchLast(arr,x,n);
        if(first==-1){
            return 0;
        }
        int c=last-first+1;
        return c;
    }
    public static int searchFirst(int arr[],int x,int n){
        int start=0;
        int end=n-1;
        int first=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==x)
            {
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]<=x)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return first;
    }
    public static int searchLast(int arr[],int x,int n)
    {
        int start=0;
        int end=n-1;
        int last=-1;
        while(start<=end)
        {
            int mid=start+end;
            if(arr[mid]==x)
            {
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]<=x)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return last;
    }
}
