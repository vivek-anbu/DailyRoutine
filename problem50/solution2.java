class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        if(s.length==0)
        {
            return 0;
        }
        int contentchildren=0;
        int i=g.length-1,j=s.length-1;
        while(i>=0&&j>=0)
        {
            if(s[j]>=g[i])
            {
                contentchildren++;
                i--;
                j--;
            }
            else{
            i--;
        
            }
        }
        return contentchildren;
    }
}
