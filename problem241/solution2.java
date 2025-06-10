class Solution {
    public int[][] merge(int[][] intervals) {

       if(intervals.length==1||intervals==null)
       {
        return intervals;
       } 
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       List<int[]> res=new ArrayList<>();
       int i=0;
       while(i<intervals.length)
       {
            int curStart=intervals[i][0];
            int curEnd=intervals[i][1];
            while(i<intervals.length-1&&intervals[i+1][0]<=curEnd)
            {
                curEnd=Math.max(curEnd,intervals[i+1][1]);
                i++;
            }
            int newEnd=curEnd;
            res.add(new int[]{curStart,newEnd});
            i++;
       }
       return res.toArray(new int[res.size()][]);
    }
}
