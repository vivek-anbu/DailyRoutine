class Solution {
    public int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> map=new HashMap<>();
            if(nums.length==1)
            {
                return nums;
            }
            int n=nums.length;
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(target-nums[i]))
                {
                    return new int[]{i,map.get(target-nums[i])};
                }
                else
                {
                    map.put(nums[i],i);
                }
            }

        return nums;
    }
}
