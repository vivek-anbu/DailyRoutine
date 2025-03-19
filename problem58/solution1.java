class Solution {
    public int[][] merge(int[][] intervals) {
       int index=0;
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       List<int[]> res=new ArrayList<>(); 
       while(index<intervals.length)
       {
            int newstart=intervals[index][0];
            int curend=intervals[index][1];
            while(index<intervals.length-1&&curend>=intervals[index+1][0])
            {
                curend=Math.max(curend,intervals[index+1][1]);
                index++;
            }
            int newend=curend;
            res.add(new int[]{newstart,newend});
            index++;

       }
       int arr[][]=new int[res.size()][2];
       
       index=0;
       for(int []resarr:res)
       {
            arr[index++]=resarr;
       }

        return arr;

    }
}
