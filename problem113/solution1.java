class Solution {
    public int GCD(int n1, int n2) {

        int max=0;
        for(int i=1;i<n2;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                max=Math.max(i,max);
            }
        }
        return max;
    }
}
