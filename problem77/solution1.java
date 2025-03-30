class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n=cardPoints.length;
        int ans=0;
        int sum=0;
        int i=0;
        while(i<k)
        {
            ans=ans+cardPoints[i];
            i++;
        }
        i--;
        int j=n-1;
        sum=ans;
        while(j>=n-k)
        {
            sum=sum+cardPoints[j];
            j--;
            sum=sum-cardPoints[i];
            i--;
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
