class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int s=0;
        int missingNo=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
        }
        missingNo=sum-s;
        return missingNo;
    }
}
