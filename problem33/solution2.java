class Solution {
    public String largestOddNumber(String num) {

        int n=num.length();
        int i=n-1;
        while(i>=0&&(num.charAt(i)-0)%2==0)
        {
            i--;
        }  

        return num.substring(0,i+1);
    }
}
