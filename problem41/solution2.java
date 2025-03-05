class Solution {
    public int myAtoi(String s) {
    
           s=s.trim();
        if(s.isEmpty())
            return 0;
        if(s==null)
        {
            return 0;
        }
 
        int sign=1;
        long num=0;
        int i=0;
        if(s.charAt(i)=='-'||s.charAt(i)=='+')
       {
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
       }
       int MIN=Integer.MIN_VALUE;
       int MAX=Integer.MAX_VALUE;
       while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9')
       {
            num=num*10+(s.charAt(i)-'0');
            if(num*sign>MAX)
            {
                return MAX;
            }
            if(num*sign<MIN)
            {
                return MIN;
            }
            i++;
       }

        return (int)(num*sign);

    }
}
