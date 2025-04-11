class Solution {
    long mod=1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;

        return (int )(pow(4,odd)*pow(5,even)%mod);
    }
    public long pow(long base,long n)
    {
        if(n==0)
        {
            return 1;
        }
        long temp=pow(base,n/2);
        if(n%2==0)
        {
            return (temp*temp)%mod;
        }
        else 
        return (temp*temp*base)%mod;
    }
}
