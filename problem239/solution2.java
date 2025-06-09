class Solution {
    class Meetings{
        int start;
        int end;
        Meetings(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeetings(int[] start, int[] end) {
    
        int n=start.length;
        Meetings meet[]=new Meetings[n];
        for(int i=0;i<n;i++)
        {
            meet[i]=new Meetings(start[i],end[i]);
        }
        Arrays.sort(meet,(a,b)->a.end-b.end);
        int ans=1;
        int endPoint=meet[0].end;
        for(int i=1;i<n;i++)
        {
            if(meet[i].start>endPoint)
            {
                ans++;
                endPoint=meet[i].end;
            }
        }
        return ans;
    }
}
