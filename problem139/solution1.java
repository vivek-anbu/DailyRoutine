class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {   
                list1.add(nums[i]);
            }
           
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                list2.add(nums[i]);
            }
        }
        int arr[]=new int[list1.size()+list2.size()];
        int i=0;
        int j=0;
        int k=0;
        while(i<list1.size()||j<list2.size())
        {
            if(k%2==0)
            {
                arr[k++]=list1.get(i);
                i++;
            }
            else
            {
                arr[k++]=list2.get(j);
                j++;
            }
        }
        
        return arr;
    }
}
