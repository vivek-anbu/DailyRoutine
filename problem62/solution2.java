class Solution {
    public String countAndSay(int n) {
        
        if(n==1)
        {
            return "1";
        }
        String cur="1";
        for(int k=1;k<n;k++)
        {
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<cur.length();i++)
            {
                int count=1;
                while(i<cur.length()-1&&cur.charAt(i)==cur.charAt(i+1))
                {
                    count++;
                    i++;
                }
                ans.append(count).append(cur.charAt(i));
            }
            cur=ans.toString();
        }
        return cur;
    }
}
