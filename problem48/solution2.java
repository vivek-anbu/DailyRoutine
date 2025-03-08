class Solution {
    public int climbStairs(int n) {

            if(n==0||n==1)
            {
                return 1;
            }
            int prev=1,cur=1;
            for(int i=2;i<n+1;i++)
            {
                int temp=cur;
                cur=prev+cur;
                prev=temp;
            }

            return cur;
    }
}
