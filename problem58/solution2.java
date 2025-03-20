class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals==null||intervals.length<=1)
        {
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int cur[]=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=cur[1])
            {
                cur[1]=Math.max(cur[1],intervals[i][1]);
            }
            else
            {
                ans.add(cur);
                cur=intervals[i];
            }

        }
        ans.add(cur);
        return ans.toArray(new int[ans.size()][2]);
    }
}
