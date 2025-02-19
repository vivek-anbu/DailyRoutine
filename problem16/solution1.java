class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        
        int start=0;
        int end=arr.length-1;
        int floor=-1;
        int ceil=-1;
        Arrays.sort(arr);
        while(start<=end)
        {
            int mid=(start+end)/2;
            
            if(arr[mid]==x)
            {
                return new int[]{arr[mid],arr[mid]};
            }
            if(arr[mid]<x)
            {
                floor=arr[mid];
                start=mid+1;
            }
            else if(arr[mid]>x)
            {   
                ceil=arr[mid];
                end=mid-1;
                
            }
            
        }
            return new int[]{floor,ceil};
    }
}
