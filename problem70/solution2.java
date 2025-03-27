class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        int power=(int)Math.pow(2,nums.length);
        power--;
        for(int i=power;i>=0;i--)
        {
            int temp=i;
            ArrayList<Integer> list=new ArrayList<>();
            int index=nums.length-1;
            while(index>=0)
            {
                if((temp&1)==1)
                {
                    list.add(nums[index]);
                }
                temp=temp>>1;
                index--;
            }
            res.add(list);
        }
        return res;
    }
}
