class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int cnt[]=new int[26];
        for(int i=0;i<taks.length;i++)
        {
            cnt[taks[i]-'A'];
        }
        Arrays.sort(cnt);
        int max=cnt[25]-1;
        idle=max*n;
        for(int i=cnt.length-2;i>=0&&cnt[i]!=0;i--)
        {
            idle=idle-Math.min(cnt[i],max);
        }
        return idle>0?idle+tasks.length:tasks.length;
    }
}
