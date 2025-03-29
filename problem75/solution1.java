class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        for(int num:nums)
        {
            sum=sum+num;
            if(sum==goal)
            {
                count++;
            }
            if(map.containsKey(sum-goal))
            {
                count=count+map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
