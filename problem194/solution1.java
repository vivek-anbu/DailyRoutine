class Solution {
    public int minBitFlips(int start, int goal) {
        
        String str1=Integer.toBinaryString(start);
        String str2=Integer.toBinaryString(goal);

        if(str1.length()>str2.length())
        {
            while(str1.length()>str2.length()){
            str2="0"+str2;}
        }
        else if(str2.length()>str1.length())
        {
            while(str2.length()>str1.length()){
            str1="0"+str1;}
        }
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}
