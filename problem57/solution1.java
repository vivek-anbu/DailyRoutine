class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> res=new ArrayList<>();
        int cur=0;
        while(cur<intervals.length&&intervals[cur][1]<newInterval[0])
        {
            res.add(intervals[cur++]);
        }  
        while(cur<intervals.length&&intervals[cur][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(intervals[cur][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[cur][1],newInterval[1]);
            cur++;
        }
        res.add(newInterval);
        while(cur<intervals.length)
        {
            res.add(intervals[cur++]);
        }
        return res.toArray(new int[res.size()][]);
    }
}
