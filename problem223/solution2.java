class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int l=0;
        int sum=0;
        int ans=0;
        while(l<k)
        {
            ans=ans+cardPoints[l];
            l++;
        }
        l--;
        sum=ans;
        int r=cardPoints.length-1;
        while(r>=cardPoints.length-k)
        {
            sum=sum-cardPoints[l];
            l--;
            sum=sum+cardPoints[r];
            r--;
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
