// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
       
       int n=arr.length;
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;i<n;i++)
           {
               if(arr[i]>arr[j])
               {
                   arr[i]=arr[j];
                   break;
               }
               else
               {
                   arr[i]=-1;
                   break;
               }
           }
           
       }
       arr[arr.length-1]=-1;
        
    }
}
