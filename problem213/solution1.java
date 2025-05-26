class Solution {
    public int sumSubarrayMins(int[] arr) {
       long ans=0;
        int MOD=1_000_000_007;
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++)
        {
            while(!st.isEmpty()&&(i==n||arr[st.peek()]>=arr[i]))
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
                ans=(ans+(long)arr[min]*(min-j)*(i-min))%MOD;
            }
            st.push(i);
        }
        return (int)ans;
    }
}
