public class Solution {
    public static void nLetterTriangle(int n) {
        
        for(int i=1;i<=n;i++)
        {
            for(char j='A';j<='A'+n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
