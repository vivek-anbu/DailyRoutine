class Solution {
    public int minBitFlips(int start, int goal) {

       int count=0;
       int num=start^goal;
       while(num>0)
       {
        count=count+(num&1);
        num=num>>1;
       }
        return count;
    }
}
