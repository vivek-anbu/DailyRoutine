import java.util.Arrays;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {

        int minplat=1;
        int maxplat=1;
        int i=1;
        int j=0;
        Arrays.sort(at);
        Arrays.sort(dt);
        while(i<n)
        {
            if(at[i]<=dt[j])
            {
                minplat++;
                i++;
            }else
            {
                minplat--;
                j++;
            }
            maxplat=Math.max(maxplat,minplat);
        }
        return maxplat;

    }
}
