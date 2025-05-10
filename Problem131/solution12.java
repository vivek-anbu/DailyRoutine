public class Solution {
    public static void numberCrown(int n) {
        
        int space =2*n-2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(int m=i;m>=1;m--)
            {
                System.out.print(m+" ");
            }
            space=space-2;
            System.out.println();
        }
    }
}
  
