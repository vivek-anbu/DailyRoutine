class Solution {

    void mergeSort(int arr[], int l, int r) {
  
        if(l<r)
        {
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,r,mid);
        }
        
    }
    public void merge(int arr[],int l,int r,int mid)
    {
        int n=mid-l+1;
        int m=r-mid;
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=arr[l+i];
        }
        for(int j=0;j<m;j++)
        {
            b[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n&&j<m)
        {
            if(a[i]<=b[j])
            {
                arr[k++]=a[i++];
            }
            else
            {
                arr[k++]=b[j++];
            }
        }
        while(i<n)
        {
            arr[k++]=a[i++];
        }
        while(j<m)
        {
            arr[k++]=b[j++];
        }
    }
}
       
