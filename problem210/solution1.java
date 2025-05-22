 class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
       
        int ans[]=new int[n];
         Arrays.fill(ans,-1);
        for(int i=0;i<2*n;i++)
        {
            int in=(i%n);
            while(!st.isEmpty()&&nums[st.peek()]<nums[in])
            {
                int j=st.pop();
                ans[j]=nums[in];
            }
            if(i<n)
            st.push(in);
            
        }
        return ans;
    }
}
