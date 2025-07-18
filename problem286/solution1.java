class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            list.add(nums[i]);
        }
        Collections.sort(list,(a,b)->{
       int  freqA=map.get(a);
        int freqB=map.get(b);
        if(freqA!=freqB)
        return freqA-freqB;
        else
        {
            return b-a;
        }
    });
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        return nums;
    }
}
