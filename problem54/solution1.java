class Solution {
    class Meeting
    {
        int start;
        int end;
        Meeting(int start,int end)
        {   
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        
        int n=start.length;
        Meeting[] meetings=new Meeting[n];
        for(int i=0;i<n;i++)
        {
            meetings[i]=new Meeting(start[i],end[i]);
        }
        Arrays.sort(meetings,(a,b)->a.end-b.end);
        int ans=1;
        int endpoint=meetings[0].end;
        for(int i=1;i<n;i++)
        {
            if(meetings[i].start>endpoint)
            {
                ans++;
                endpoint=meetings[i].end;
            }
        }
        
        return ans;
    }
}
