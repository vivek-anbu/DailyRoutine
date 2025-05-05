

// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
       return findPivot(arr) + 1;
       
        
        
    }
    
    public int findPivot (List<Integer> arr){
        
        int start = 0;
        int end = arr.size() - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(start < end && arr.get(mid) > arr.get(mid + 1)){
                return mid;
            }
            else if(start < end && arr.get(mid) < arr.get(mid - 1)){
                return mid -1 ;
            }
            else if(arr.get(start) <= arr.get(mid)){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
