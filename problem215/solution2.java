class Solution {
    public long subArrayRanges(int[] nums) {
        
        Stack<Integer> st=new Stack<>();
        long res=0;
        int n=nums.length;
        for(int i=0;i<=n;i++)
        {
            while(!st.isEmpty()&&(i==n||nums[st.peek()]>nums[i]))
            {
                int min=st.peek();
                st.pop();
                int j;
                if(st.isEmpty())
                {
                    j=-1;
                }
                else
                {
                    j=st.peek();
                }
                res-=(long)nums[min]*(min-j)*(i-min);
            }
            st.push(i);
        }
        st.clear();

        for(int i=0;i<=n;i++)
        {
            while(!st.isEmpty()&&(i==n||nums[st.peek()]<nums[i]))
            {
                int max=st.peek();
                st.pop();
                int j;
                if(st.isEmpty())
                {
                    j=-1;
                }
                else
                {
                    j=st.peek();
                }
                res+=(long)nums[max]*(max-j)*(i-max);
            }
            st.push(i);
        }
        return res;

    }
}
