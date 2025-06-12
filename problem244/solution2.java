// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        
        Arrays.sort(bt);
        int time=0;
        int waitTime=0;
        int n=bt.length;
        for(int i=0;i<n;i++)
        {
            waitTime+=time;
            time+=bt[i];
        }
        return waitTime/bt.length;
    }
}
