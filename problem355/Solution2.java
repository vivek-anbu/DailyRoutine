class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        
        int n =arr.length;
        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    }
}
