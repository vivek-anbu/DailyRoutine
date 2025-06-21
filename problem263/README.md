// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1;
        int j=0;
        int min=1;
        int maxNeed=1;
        while(i<arr.length)
        {
            if(arr[i]<=dep[j])
            {
                min++;
                i++;
            }
            else
            {
                min--;
                j++;
            }
            maxNeed=Math.max(maxNeed,min);
        }
        return maxNeed;
    }
}
