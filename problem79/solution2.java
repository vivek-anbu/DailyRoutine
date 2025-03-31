class Solution {
    public int leastInterval(char[] tasks, int n) {

      int max=0;
      int cnt[]=new int[26];
      for(char c:tasks)
      {
        cnt[c-'A']++;
      }
      Arrays.sort(cnt);
      max=cnt[25]-1;
      int idle=max*n;
      for(int i=cnt.length-2;i>=0&&cnt[i]!=0;i--)
      {
        idle=idle-Math.min(cnt[i],max);
      }
      return idle>0?idle+tasks.length:tasks.length;

    }
}
