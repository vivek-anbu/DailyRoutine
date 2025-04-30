class Solution {
    public int longestConsecutive(int[] nums) {

       Set<Integer> set=new HashSet<>();
       int max=0;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int curNum=num;
                int count=1;
                while(set.contains(curNum+1))
                {
                    curNum++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
