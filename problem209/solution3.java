class Solution {
    public int[] greaterElement(int a[])
    {
        int n=a.length;
        int b[]=new int [n];
        Arrays.fill(b,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&&a[st.peek()]<a[i])
            {
                int in=st.pop();
                b[in]=a[i];
            }
            st.push(i);
        }


        return b;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int arr[]=greaterElement(nums2);
        int ans[]=new int[nums1.length];
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    ans[i]=arr[j];
                    break;
                }
            }
            
        }
        return ans;
    }
}
