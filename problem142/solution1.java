class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        System.out.println(set);
        for(int i=0;i<set.size();i++)
        {
            int count=1;
            for(int j=0;j<set.size();j++)
            {
                if(i!=j){
                if(set.contains(nums[i]-nums[j]))
                {
                    count++;
                }
                }
                max=Math.max(count,max);
            }
        }

        return max;
    }
}
