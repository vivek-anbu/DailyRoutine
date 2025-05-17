
class Solution {
    public static int findXOR(int l, int r) {
        int s=0;
         for(int i=l;i<=r;i++)
         {
             s^=i;
         }
         return s;
    }
}
