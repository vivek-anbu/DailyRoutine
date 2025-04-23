
class Solution {

    void mergeSort(int arr[], int l, int r) {
        
        if(l>=r)
        {
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public void merge(int arr[],int l,int mid,int r)
    {
        int i=l;
        int j=mid+l;
        int k=0;
        int temp[]=new int[r-l+1];
        while(i<=mid&&j<=r)
        {
            if(arr[i]>arr[j])
            {
                temp[k++]=arr[i++];
            }
            else
            {
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=r)
        {
            temp[k++]=arr[j++];
        }
        int startIndex=l;
        for(k=0;k<temp.length;k++)
        {
            arr[startIndex++]=temp[k];
        }
    }
}
