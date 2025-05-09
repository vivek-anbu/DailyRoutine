class Solution {
    public boolean isAnagram(String s, String t) {
    
       char count[]=new char[26];
       for(char c:s.toCharArray())
       {
            count[c-'a']++;
       }
       for(char c:t.toCharArray())
       {
            count[c-'a']--;
       }
       for(int i=0;i<count.length;i++)
       {
        if(count[i]!=0)
        {
            return false;
        }
       }
       return true;
    }
}
