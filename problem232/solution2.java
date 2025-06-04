class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int i=g.length-1;
        int j=s.length-1;
        int contentWithChild=0;
        while(i>=0&&j>=0)
        {
            if(s[j]>=g[i])
            {
                contentWithChild++;
                i--;
                j--;
            }
            else
            {
                i--;
            }
        }
        return contentWithChild;
    }
}
