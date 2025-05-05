class Solution {
    public int findKRotation(List<Integer> arr) {
        
        int k=0;
            for(int j=arr.size()-1;j>0;j--)
            {
                if(arr.get(j-1)<arr.get(j))
                {
                    continue;
                }
                else{
                k=j;
                break;
                }
            }
            return k;
    }
}
