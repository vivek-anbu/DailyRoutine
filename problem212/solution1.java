// User function Template for Java

class Solution {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
       
        int temp[]=new int[indices.length];
        int t=0;
        for(int i=0;i<indices.length;i++)
        {
            int count=0;
            int ele=indices[i];
            for(int j=ele+1;j<arr.length;j++)
            {
                if(arr[ele]<arr[j])
                {
                    count++;
                }
            }
            temp[t++]=count;
        }
        
        return temp;
    }
}
