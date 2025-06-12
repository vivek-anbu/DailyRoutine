// User function Template for Java

class Solution {
    static int solve(int bt[]) {
         
         Arrays.sort(bt);
         int time=0,waitTime=0;
         for(int num:bt)
         {
             waitTime+=time;
             time+=num;
         }
         return waitTime/bt.length;
        
    }
}
