// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {  
            int val=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    val=arr[j];
                    break;
                }
            }
            arr[i]=val;
        }
        
    }
}
