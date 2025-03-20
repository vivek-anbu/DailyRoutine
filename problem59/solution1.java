class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        for(int i=0;i<intervals.length;i++)
        {
            int curend=intervals[i][1];
            while(i<intervals.length-1&&curend>intervals[i+1][0])
            {
                count++;
                curend=Math.min(intervals[i+1][1],curend);
                i++;
            }
    
        }
        return count;
    }
}
