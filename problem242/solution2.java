class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int count=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        for(int i=0;i<intervals.length;i++)
        {
            int curEnd=intervals[i][1];
            while(i<intervals.length-1&&curEnd>intervals[i+1][0])
            {
                count++;
                curEnd=Math.min(curEnd,intervals[i+1][1]);
                i++;
            }

        }   
        return count;
    }
}
