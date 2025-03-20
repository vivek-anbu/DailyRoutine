class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        
        int count=0;
        int i=0;
        while(i<intervals.length)
        {   
            int curend=intervals[i][1];
            while(i<intervals.length-1&&curend>intervals[i+1][0])
            {
                count++;
                curend=Math.min(curend,intervals[i+1][1]);
                i++;
            }
            i++;
        }

        return  count;
    }
}
