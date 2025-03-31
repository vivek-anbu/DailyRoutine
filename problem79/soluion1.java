class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int cnt[]=new int[26];
        int max=0;
        for(int i=0;i<tasks.length;i++)
        {
            cnt[tasks[i]-'A']++;
        }
        Arrays.sort(cnt);
        max=cnt[25];
        int idle=(max-1)*n;
        for(int i=24;i>=0;i--)
        {
            idle=idle-Math.min(max-1,cnt[i]);
        }
        idle=Math.max(0,idle);
        return tasks.length+idle;
    }
}
