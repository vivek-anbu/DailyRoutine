public class Solution {
    public static void getNumberPattern(int n) {
        
       for(int i=0;i<2*n-1;i++)
       {
           for(int j=0;j<2*n-1;j++)
           {
               int top=i;
               int bottom=j;
               int left=(2*n-2)-i;
               int right=(2*n-2)-j;
            System.out.print(n-Math.min(Math.min(left,right),Math.min(top,bottom)));
           }
           System.out.println();
       }
    }
}
