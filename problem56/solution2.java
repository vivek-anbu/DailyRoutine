
class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
    
        int n=arr.length;
            int maxflat=1;
            for(int i=0;i<n;i++)
            {
                int minflat=1;
                for(int j=0;j<n;j++)
                {
                    if(i!=j&&arr[j]<=dep[i]&&dep[j]>=arr[i])
                    {
                        minflat++;
                    }
                }
                maxflat=Math.max(minflat,maxflat);
            }
            return maxflat;
    }
}
