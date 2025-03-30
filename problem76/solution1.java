class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        int count[]=new int[3];
        int ans=0;
        for(j=0;j<s.length();j++)
        {
            count[s.charAt(j)-'a']++;
            while(count[0]>0&&count[1]>0&&count[2]>0)
            {
                count[s.charAt(i)-'a']--;
                i++;
            }
            ans=ans+i;
        }
        return ans;
    }
}
