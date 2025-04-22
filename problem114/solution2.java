class Solution {
    public int factorial(int n) {
        int fact=1;
        if(n==0)
        {
            return 1;
        }
        fact=n*factorial(n-1);
        return fact;
    }
}
