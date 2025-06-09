class Solution {
    public int maxMeetings(int[] start, int[] end) {
       
       int n=start.length;
       int meetings[][]=new int[n][2];
       for(int i=0;i<n;i++)
       {
        meetings[i][0]=start[i];
        meetings[i][1]=end[i];
       }
       int ans=1;
       int endPoint=meetings[0][1];
       for(int i=1;i<n;i++)
       {
        if(meetings[i][0]>endPoint)
        {
            ans++;
            endPoint=meetings[i][1];
        }
       }
       return ans;
    }
}
