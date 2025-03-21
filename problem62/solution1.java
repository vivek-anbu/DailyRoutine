class Solution {
    public String countAndSay(int n) {
        String cur="1";
        for(int k=1;k<n;k++)
        {
            String ans="";
            int i=0;
            while(i<cur.length())
            {
                int charCount=1;
                while(i<cur.length()-1&&cur.charAt(i)==cur.charAt(i+1))
                {
                    charCount++;
                    i++;
                }
                ans+=Integer.toString(charCount)+cur.charAt(i);
                i++;
            }
            cur=ans;
        }

        return cur;

    }
}
