public class Solution {
    public static void alphaHill(int n) {
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            int breakPoint=(2*i+1)/2;
            char c='A';
            for(int k=1;k<=2*i+1;k++)
            {
                System.out.print(c+" ");
                if(k<=breakPoint)
                {
                    c++;
                }
                else
                {
                    c--;
                }    
            }
            System.out.println();

        }
    }
}
