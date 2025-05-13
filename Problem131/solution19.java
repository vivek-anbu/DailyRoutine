public class Solution {
    public static void symmetry(int n) {
        
        int space=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                 System.out.print("* ");
            }
            for(int k=0;k<=space;k++)
            {
                 System.out.print(" ");
            }
            for(int m=1;m<=n-i;m++)
            {
                 System.out.print("* ");
            }
                space=space+2;
             System.out.println();
        }
        space=2*n-2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                 System.out.print("* ");
            }
            for(int k=0;k<=space;k++)
            {
                 System.out.print(" ");
            }
            for(int m=0;m<=i;m++)
            {
                 System.out.print("* ");
            }
            space=space-2;
             System.out.println();
        }

    }
}
