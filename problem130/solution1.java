class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> single=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            single.put(nums[i],single.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> it:single.entrySet())
        {
            if(it.getValue()==1)
            {
                return it.getKey();
            }
        }
        return -1;
    }
}
