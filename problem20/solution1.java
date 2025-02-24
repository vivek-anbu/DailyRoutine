//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class Solution {
    public int findKRotation(List<Integer> arr) {
        
       int ans=Integer.MAX_VALUE;
       int index=0;
       for(int i=0;i<arr.size();i++)
       {
           if(arr.get(i)<ans)
           {
               ans=arr.get(i);
               index=i;
           }
       }
        return index;
        
    }
}
