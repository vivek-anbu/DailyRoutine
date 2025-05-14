public class Solution {
    public static void symmetry(int n) {
        
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++)
        {
            int stars=i;
            if(i>n)
            {
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(int m=1;m<=stars;m++)
            {
                System.out.print("* ");
            }
            if(i<n)
            {
                space=space-2;
            }
            else
            {
                space=space+2;
            }
            System.out.println();
        }
    }
}
