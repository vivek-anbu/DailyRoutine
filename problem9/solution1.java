class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s=new HashSet<>();
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            s.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(!s.contains(nums[i]-1))
            {
                int cn=nums[i];
                int curlength=1;
                while(s.contains(cn+1))
                {
                    cn++;
                    curlength++;
                }
                max=Math.max(max,curlength);
            }
            
        }

        return max;
    }
}
