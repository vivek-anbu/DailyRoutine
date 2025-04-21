class Solution {
    public boolean isArmstrong(int n) {

        int rem=0;
        int temp=n;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+(int)Math.pow(rem,3);
            n=n/10;
        }
        if(sum==temp)
        {
            return true;
        }

return false;
    }
}
