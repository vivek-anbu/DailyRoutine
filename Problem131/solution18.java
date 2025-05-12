public class Solution {
    public static void alphaTriangle(int n) {
        
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
