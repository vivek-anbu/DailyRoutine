class Solution {
    public boolean rotateString(String s, String goal) {

       StringBuilder sb=new StringBuilder(s);
       for(int i=0;i<sb.length();i++)
       {
            if(sb.toString().equals(goal))
            {
                return true;
            }
            char c=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
       }
       return false;

    }
}
