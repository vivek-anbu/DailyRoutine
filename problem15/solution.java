//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
class Solution {

    static int findFloor(int[] arr, int k) {
        
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
}




  
