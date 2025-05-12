public class Solution {
    public static void alphaRamp(int n) {
       
       char c='A';
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<=i;j++)
           {
               System.out.print((char)(c+i)+" ");
           }
           System.out.println();
       }
    }
}
