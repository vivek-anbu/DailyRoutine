class Solution {
    
    static int findPlatform(int arr[], int dep[]) {
       
       int max=1;
       int maxneed=1;
       int i=1;
       int j=0;
       Arrays.sort(arr);
       Arrays.sort(dep);
       while(i<arr.length)
       {
           if(arr[i]<=dep[j])
           {
               max++;
               i++;
           }
           else
           {
               max--;
               j++;
           }
          maxneed=Math.max(max,maxneed);
       }
       return maxneed;
     }
}
